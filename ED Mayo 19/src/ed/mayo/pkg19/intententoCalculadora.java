
package ed.mayo.pkg19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class intententoCalculadora extends JFrame implements ActionListener{

    JLabel labelTitle, labelNum1, labelNum2, labelResult;
    JTextField txtNum1, txtNum2; // Text fields for user input
    JButton btnAdd, btnSubtract, btnMultiply, btnDivide, btnClear, btnExit;

    intententoCalculadora() {
        setLayout(null); // Use absolute positioning for components

        // --- Labels ---
        labelTitle = new JLabel("Calculadora Básica");
        labelTitle.setBounds(150, 20, 200, 30);
        add(labelTitle);

        labelNum1 = new JLabel("Número 1:");
        labelNum1.setBounds(50, 70, 100, 30);
        add(labelNum1);

        labelNum2 = new JLabel("Número 2:");
        labelNum2.setBounds(50, 110, 100, 30);
        add(labelNum2);

        labelResult = new JLabel("Resultado: ");
        labelResult.setBounds(50, 150, 300, 30); // Increased width for result
        add(labelResult);

        // --- Text Fields ---
        txtNum1 = new JTextField();
        txtNum1.setBounds(150, 70, 150, 30);
        add(txtNum1);

        txtNum2 = new JTextField();
        txtNum2.setBounds(150, 110, 150, 30);
        add(txtNum2);

        // --- Operation Buttons ---
        btnAdd = new JButton("Sumar (+)");
        btnAdd.setBounds(50, 200, 100, 30);
        add(btnAdd);
        btnAdd.addActionListener(this); // Register action listener

        btnSubtract = new JButton("Restar (-)");
        btnSubtract.setBounds(160, 200, 100, 30);
        add(btnSubtract);
        btnSubtract.addActionListener(this);

        btnMultiply = new JButton("Multiplicar (*)");
        btnMultiply.setBounds(270, 200, 120, 30);
        add(btnMultiply);
        btnMultiply.addActionListener(this);

        btnDivide = new JButton("Dividir (/)");
        btnDivide.setBounds(400, 200, 100, 30);
        add(btnDivide);
        btnDivide.addActionListener(this);

        // --- Utility Buttons ---
        btnClear = new JButton("Limpiar");
        btnClear.setBounds(150, 260, 100, 30);
        add(btnClear);
        btnClear.addActionListener(this);

        btnExit = new JButton("Salir");
        btnExit.setBounds(260, 260, 100, 30);
        add(btnExit);
        btnExit.addActionListener(this);

        // --- JFrame properties ---
        setTitle("Calculadora Simple");
        setSize(550, 350); // Set window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close on X button
        setResizable(false); // Prevent resizing
        setLocationRelativeTo(null); // Center the window on screen
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle Exit button
        if (e.getSource() == btnExit) {
            System.exit(0);
        }
        // Handle Clear button
        else if (e.getSource() == btnClear) {
            txtNum1.setText("");
            txtNum2.setText("");
            labelResult.setText("Resultado: ");
            txtNum1.requestFocus(); // Set focus back to first input field
        }
        // Handle other operation buttons
        else {
            try {
                // Get numbers from text fields
                double num1 = Double.parseDouble(txtNum1.getText());
                double num2 = Double.parseDouble(txtNum2.getText());
                double result = 0;

                // Perform the selected operation
                if (e.getSource() == btnAdd) {
                    result = num1 + num2;
                } else if (e.getSource() == btnSubtract) {
                    result = num1 - num2;
                } else if (e.getSource() == btnMultiply) {
                    result = num1 * num2;
                } else if (e.getSource() == btnDivide) {
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(this, "Error: No se puede dividir por cero.", "Error de División", JOptionPane.ERROR_MESSAGE);
                        labelResult.setText("Resultado: Error");
                        return; // Exit method if division by zero
                    }
                    result = num1 / num2;
                }

                // Display the result
                labelResult.setText("Resultado: " + String.format("%.2f", result)); // Format to 2 decimal places
            } catch (NumberFormatException ex) {
                // Handle cases where input is not a valid number
                JOptionPane.showMessageDialog(this, "Por favor, ingrese números válidos en ambos campos.", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
                labelResult.setText("Resultado: Error");
            }
        }
    }

    public static void main(String[] args) {
        // Create and show the calculator frame
        new Calculadora().setVisible(true);
    }
}
    

