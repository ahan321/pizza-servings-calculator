/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzaservingscalculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Ahan Malli
 */
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pizza Servings Calculator");
        frame.setSize(350,300);
        GridLayout gridLayout = new GridLayout(4,1);
        frame.setLayout(gridLayout);
        
        JLabel title = new JLabel("Pizza Servings Calculator", SwingConstants.CENTER);
        title.setForeground(Color.red);
        
        title.setFont(new Font("Times New Roman", Font.BOLD, 26));
        frame.add(title);
        
        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter the size of the pizza in inches: "));
        
        JTextField field = new JTextField("", 4);
        panel.add(field);
        frame.add(panel);
        JButton button = new JButton("Calculate Servings");
        frame.add(button);
        JLabel label2 = new JLabel("",SwingConstants.CENTER);
        frame.add(label2);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int size = Integer.parseInt(field.getText());
                double expression = size / 8.00;
                double servings = Math.pow(expression,2);
                String result = String.format("A %d inch pizza will serve %.2f people.", size, servings);
                label2.setText(result);
            }
        });
                
        frame.setVisible(true);
        
        
    }
}
