/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.openbravo.pos.panels;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingUtilities;

/**
 *
 * @author dixon
 */
public class SpringDemo {
    public static void main(String args[]) {
        SwingUtilities.invokeLater(SpringDemo::createAndShowGUI);
    }
    
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("SpringLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container cnt = frame.getContentPane();
        SpringLayout sl = new SpringLayout();
        cnt.setLayout(sl);
        JLabel jLabel = new JLabel("Label: ");
        cnt.add(jLabel);
        JTextField textField = new JTextField("JTextField", 15);
        cnt.add(textField);
        
        sl.putConstraint(SpringLayout.WEST, jLabel, 5, SpringLayout.WEST, cnt);
        
        sl.putConstraint(SpringLayout.NORTH, jLabel,
                             5,
                             SpringLayout.NORTH, cnt);
 
        //Adjust constraints for the text field so it's at
        //(<label's right edge> + 5, 5).
        sl.putConstraint(SpringLayout.WEST, textField,
                             5,
                             SpringLayout.EAST, jLabel);
        sl.putConstraint(SpringLayout.NORTH, textField,
                             5,
                             SpringLayout.NORTH, cnt);
        frame.pack();
        frame.setVisible(true);
    }
}
