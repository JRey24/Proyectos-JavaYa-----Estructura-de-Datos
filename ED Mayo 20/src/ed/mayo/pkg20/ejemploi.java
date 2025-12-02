package ed.mayo.pkg20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ejemploi extends JFrame implements ActionListener {

    static Nodo cab, p, q, nuevo;
    JLabel label1, label2, resultado; // 'resultado' will display the list
    JButton boton1, imprimir, retirar, insertar, sumar, restar;
    JTextField caja;

    ejemploi() {
        cab = new Nodo(-999, null); // Dummy head node
        cab.sig = cab; // Make it circular initially
        setLayout(null); // Use absolute positioning for components

        // --- Labels ---
        label1 = new JLabel("COLA (Lista Circular)");
        label1.setBounds(10, 20, 200, 30);
        add(label1);

        label2 = new JLabel("Digite dato:");
        label2.setBounds(10, 60, 100, 30);
        add(label2);

        caja = new JTextField();
        caja.setBounds(120, 60, 100, 30);
        add(caja);

        // This JLabel will now be used to display the list content
        resultado = new JLabel("Contenido de la cola: ");
        resultado.setBounds(10, 90, 500, 30); // Increased width to show more elements
        add(resultado);

        // --- Buttons ---
        boton1 = new JButton("Finalizar");
        boton1.setBounds(300, 210, 100, 30);
        add(boton1);
        boton1.addActionListener(this);

        imprimir = new JButton("Imprimir Cola");
        imprimir.setBounds(300, 250, 120, 30);
        add(imprimir);
        imprimir.addActionListener(this);

        retirar = new JButton("Retirar");
        retirar.setBounds(300, 290, 100, 30);
        add(retirar);
        retirar.addActionListener(this);

        insertar = new JButton("Insertar");
        insertar.setBounds(300, 330, 100, 30);
        add(insertar);
        insertar.addActionListener(this);

        sumar = new JButton("Sumar Valores");
        sumar.setBounds(450, 210, 150, 30);
        add(sumar);
        sumar.addActionListener(this);

        restar = new JButton("Restar Valores");
        restar.setBounds(450, 250, 150, 30);
        add(restar);
        restar.addActionListener(this);

        // --- JFrame properties ---
        setTitle("Gestor de Cola con Operaciones");
        setSize(650, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null); // Center window
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            System.exit(0);
        } else if (e.getSource() == imprimir) {
            imprimir(); // This will now update the 'resultado' JLabel
        } else if (e.getSource() == retirar) {
            retirar();
            imprimir(); // Update display after withdrawal
        } else if (e.getSource() == sumar) {
            sumar();
        } else if (e.getSource() == restar) {
            restar();
        } else if (e.getSource() == insertar) {
            String cad = caja.getText();
            if (cad.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, digite un valor para insertar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                int valor = Integer.parseInt(cad);
                insertar(valor);
                caja.setText(""); // Clear text field
                imprimir(); // Update display after insertion
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un número entero válido.", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // --- Linked List (Cola) Operations ---

    void insertar(int dato) {
        nuevo = new Nodo(dato, null);
        if (cab.sig == cab) { // List is empty (only dummy head)
            nuevo.sig = cab; // New node points to dummy head
            cab.sig = nuevo; // Dummy head points to new node (first element)
            cab = nuevo; // New node becomes the new tail
        } else {
            nuevo.sig = cab.sig; // New node points to the current "front" of the queue (after dummy head)
            cab.sig = nuevo;     // Current tail (cab) points to the new node
            cab = nuevo;         // New node becomes the new tail (new "front" of insertion)
        }
    }

    void imprimir() {
        String cad = "Contenido de la cola: [ ";
        if (cab.sig == cab) { // List is empty
            cad += "Vacía ]";
        } else {
            p = cab.sig.sig; // Start from the first actual element (element after the dummy head)
            while (p != cab.sig) { // Iterate until we loop back to the dummy head's next
                cad += p.info + " ";
                p = p.sig;
            }
            cad += "]";
        }
        // Set the text of the JLabel 'resultado'
        resultado.setText(cad);
        System.out.println(cad); // Still print to console for debugging/logging
    }

    void retirar() {
        if (cab.sig == cab) { // List is empty
            JOptionPane.showMessageDialog(this, "La cola está vacía, no hay elementos para retirar.", "Cola Vacía", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // Find the node just before the first element to be removed (which is cab.sig.sig)
        Nodo current = cab.sig; // Start 'current' from the dummy head
        Nodo prevToRemove = cab.sig; // This will become the node before the one we want to remove

        // If there's only one actual element in the list (cab -> element -> cab.sig)
        if (cab.sig.sig == cab) { // Checks if the only element is directly after the dummy head
            int valorRetirado = cab.sig.info; // This was the last element
            cab.sig = cab; // The dummy head now points to itself
            cab = cab.sig; // Reset cab to dummy head (list becomes effectively empty)
            JOptionPane.showMessageDialog(this, "Último elemento (" + valorRetirado + ") retirado. Cola vacía.", "Elemento Retirado", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // Traverse to find the node whose 'next' is the one to be removed (the head of the queue)
        // The head of the queue is always cab.sig.sig in your current insertion method.
        // We need the node *before* cab.sig.sig.
        // In a circular list where cab is tail and cab.sig is the dummy head that points to the logical head:
        // dummy_head (cab.sig) -> head_element -> ... -> tail_element (cab) -> dummy_head
        // The element to retire is 'head_element' (which is cab.sig.sig).
        // The previous element to 'head_element' is 'tail_element' (which is cab).

        // So, if we remove head_element (cab.sig.sig), then 'cab' should point to 'head_element.sig'
        int valorRetirado = cab.sig.sig.info; // Get the info of the element being removed
        cab.sig.sig = cab.sig.sig.sig; // Skip the head element; dummy head's 'next' points to the new head

        JOptionPane.showMessageDialog(this, "Se retiró el elemento: " + valorRetirado, "Elemento Retirado", JOptionPane.INFORMATION_MESSAGE);
    }

    void sumar() {
        if (cab.sig == cab) {
            JOptionPane.showMessageDialog(this, "La cola está vacía, no hay números para sumar.", "Cola Vacía", JOptionPane.INFORMATION_MESSAGE);
            resultado.setText("Contenido de la cola: [ Vacía ] Resultado de suma: 0"); // Update label
            return;
        }

        double sumaTotal = 0;
        p = cab.sig.sig;
        while (p != cab.sig) {
            sumaTotal += p.info;
            p = p.sig;
        }
        resultado.setText("Contenido de la cola: " + getColaContentString() + " | Suma: " + String.format("%.2f", sumaTotal));
    }

    void restar() {
        if (cab.sig == cab) {
            resultado.setText("Contenido de la cola: [ Vacía ] Resultado de resta: 0"); // Update label
            return;
        }

        double restaTotal = 0;
        boolean firstElement = true;

        p = cab.sig.sig;
        while (p != cab.sig) {
            if (firstElement) {
                restaTotal = p.info;
                firstElement = false;
            } else {
                restaTotal -= p.info;
            }
            p = p.sig;
        }
        resultado.setText("Contenido de la cola: " + getColaContentString() + " | Resta (Prim. - Resto): " + String.format("%.2f", restaTotal));
    }

    // Helper method to get the string representation of the queue
    private String getColaContentString() {
        String content = "";
        if (cab.sig == cab) {
            return "Vacía";
        }
        p = cab.sig.sig; // Start from the first actual element
        while (p != cab.sig) {
            content += p.info + " ";
            p = p.sig;
        }
        return "[ " + content.trim() + " ]";
    }

    public static void main(String[] args) {
        ejemploi l = new ejemploi();
        l.setVisible(true);
    }
}