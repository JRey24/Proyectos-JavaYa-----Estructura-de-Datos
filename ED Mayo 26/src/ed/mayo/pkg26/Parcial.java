package ed.mayo.pkg26;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Parcial {
    
    static Nodo cab = new Nodo(-999, null);
    static Nodo top = null;
    
   
    static JTextField outputField;
    static JTextField inputField;

    public static void main(String[] args) {
        cab.sig = cab; 
        
        
        JFrame frame = new JFrame("Gestión de Estructuras de Datos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        
        
        JLabel inputLabel = new JLabel("Dato:");
        inputLabel.setBounds(20, 20, 50, 20);
        frame.add(inputLabel);
        
        inputField = new JTextField();
        inputField.setBounds(70, 20, 100, 20);
        frame.add(inputField);
        
        JButton insertarColaBtn = new JButton("Insertar en COLA");
        insertarColaBtn.setBounds(180, 20, 150, 20);
        frame.add(insertarColaBtn);
        
        JButton insertarPilaBtn = new JButton("Insertar en PILA");
        insertarPilaBtn.setBounds(180, 50, 150, 20);
        frame.add(insertarPilaBtn);
        
        
        JButton imprimirColaBtn = new JButton("Imprimir COLA");
        imprimirColaBtn.setBounds(20, 80, 150, 20);
        frame.add(imprimirColaBtn);
        
        JButton mayorColaBtn = new JButton("Mayor en COLA");
        mayorColaBtn.setBounds(20, 110, 150, 20);
        frame.add(mayorColaBtn);
        
        JButton menorColaBtn = new JButton("Menor en COLA");
        menorColaBtn.setBounds(20, 140, 150, 20);
        frame.add(menorColaBtn);
        
        JButton topColaBtn = new JButton("Top de COLA");
        topColaBtn.setBounds(20, 170, 150, 20);
        frame.add(topColaBtn);
        
        JButton contarColaBtn = new JButton("Cantidad en COLA");
        contarColaBtn.setBounds(20, 200, 150, 20);
        frame.add(contarColaBtn);
        
       
        JButton imprimirPilaBtn = new JButton("Imprimir PILA");
        imprimirPilaBtn.setBounds(180, 80, 150, 20);
        frame.add(imprimirPilaBtn);
        
        JButton mayorPilaBtn = new JButton("Mayor en PILA");
        mayorPilaBtn.setBounds(180, 110, 150, 20);
        frame.add(mayorPilaBtn);
        
        JButton menorPilaBtn = new JButton("Menor en PILA");
        menorPilaBtn.setBounds(180, 140, 150, 20);
        frame.add(menorPilaBtn);
        
        JButton topPilaBtn = new JButton("Top de PILA");
        topPilaBtn.setBounds(180, 170, 150, 20);
        frame.add(topPilaBtn);
        
        JButton contarPilaBtn = new JButton("Cantidad en PILA");
        contarPilaBtn.setBounds(180, 200, 150, 20);
        frame.add(contarPilaBtn);
        
        
        outputField = new JTextField();
        outputField.setBounds(20, 230, 310, 20);
        outputField.setEditable(false);
        frame.add(outputField);
        
        
        insertarColaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int dato = Integer.parseInt(inputField.getText());
                    insertarCola(dato);
                    outputField.setText("Insertado en COLA: " + dato);
                    inputField.setText("");
                } catch (NumberFormatException ex) {
                    outputField.setText("Error: Ingrese un número válido");
                }
            }
        });
        
        insertarPilaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int dato = Integer.parseInt(inputField.getText());
                    insertarPila(dato);
                    outputField.setText("Insertado en PILA: " + dato);
                    inputField.setText("");
                } catch (NumberFormatException ex) {
                    outputField.setText("Error: Ingrese un número válido");
                }
            }
        });
        
        imprimirColaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                imprimirCola();
            }
        });
        
        imprimirPilaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                imprimirPila();
            }
        });
        
        mayorColaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                outputField.setText("Mayor en COLA: " + mayorCola());
            }
        });
        
        menorColaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                outputField.setText("Menor en COLA: " + menorCola());
            }
        });
        
        topColaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                outputField.setText("Top en COLA: " + topCola());
            }
        });
        
        contarColaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                outputField.setText("Cantidad en COLA: " + contarCola());
            }
        });
        
        mayorPilaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                outputField.setText("Mayor en PILA: " + mayorPila());
            }
        });
        
        menorPilaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                outputField.setText("Menor en PILA: " + menorPila());
            }
        });
        
        topPilaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                outputField.setText("Top en PILA: " + topPila());
            }
        });
        
        contarPilaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                outputField.setText("Cantidad en PILA: " + contarPila());
            }
        });
        
      
        frame.setVisible(true);
    }

   
    static void insertarCola(int dato) {
        Nodo nuevo = new Nodo(dato, cab.sig);
        cab.sig = nuevo;
        cab = nuevo;
    }

    static void imprimirCola() {
        if (cab.sig == cab) {
            outputField.setText("[ Cola Vacía ]");
            return;
        }
        StringBuilder sb = new StringBuilder("Cola: [ ");
        Nodo q = cab.sig.sig;
        while (q != cab.sig) {
            sb.append(q.info).append(" ");
            q = q.sig;
        }
        sb.append("]");
        outputField.setText(sb.toString());
    }

    static int mayorCola() {
        if (cab.sig == cab) return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        Nodo p = cab.sig.sig;
        while (p != cab.sig) {
            if (p.info > max) max = p.info;
            p = p.sig;
        }
        return max;
    }

    static int menorCola() {
        if (cab.sig == cab) return Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        Nodo p = cab.sig.sig;
        while (p != cab.sig) {
            if (p.info < min) min = p.info;
            p = p.sig;
        }
        return min;
    }

    static int topCola() {
        if (cab.sig == cab) return Integer.MIN_VALUE;
        return cab.sig.sig.info;
    }

    static int contarCola() {
        int count = 0;
        Nodo p = cab.sig.sig;
        while (p != cab.sig) {
            count++;
            p = p.sig;
        }
        return count;
    }

   
    static void insertarPila(int dato) {
        Nodo nuevo = new Nodo(dato, top);
        top = nuevo;
    }

    static void imprimirPila() {
        if (top == null) {
            outputField.setText("[ Pila Vacía ]");
            return;
        }
        StringBuilder sb = new StringBuilder("Pila (top -> bottom): [ ");
        Nodo p = top;
        while (p != null) {
            sb.append(p.info).append(" ");
            p = p.sig;
        }
        sb.append("]");
        outputField.setText(sb.toString());
    }

    static int mayorPila() {
        if (top == null) return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        Nodo p = top;
        while (p != null) {
            if (p.info > max) max = p.info;
            p = p.sig;
        }
        return max;
    }

    static int menorPila() {
        if (top == null) return Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        Nodo p = top;
        while (p != null) {
            if (p.info < min) min = p.info;
            p = p.sig;
        }
        return min;
    }

    static int topPila() {
        if (top == null) return Integer.MIN_VALUE;
        return top.info;
    }

    static int contarPila() {
        int count = 0;
        Nodo p = top;
        while (p != null) {
            count++;
            p = p.sig;
        }
        return count;
    }
}