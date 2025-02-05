package Davaleba5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProductEntryApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ProductEntryApp::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Product Entry");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel nameLabel = new JLabel("Product Name:");
        JTextField nameField = new JTextField();

        JLabel priceLabel = new JLabel("Price:");
        JTextField priceField = new JTextField();

        JLabel quantityLabel = new JLabel("Quantity:");
        JTextField quantityField = new JTextField();

        JButton addButton = new JButton("Add");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                String price = priceField.getText().trim();
                String quantity = quantityField.getText().trim();

                if (name.isEmpty() || price.isEmpty() || quantity.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill all fields!", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                try (BufferedWriter writer = new BufferedWriter(new FileWriter("products.txt", true))) {
                    writer.write(name + "," + price + "," + quantity);
                    writer.newLine();
                    JOptionPane.showMessageDialog(frame, "Product added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Error saving product!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(priceLabel);
        frame.add(priceField);
        frame.add(quantityLabel);
        frame.add(quantityField);
        frame.add(new JLabel()); 
        frame.add(addButton);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
