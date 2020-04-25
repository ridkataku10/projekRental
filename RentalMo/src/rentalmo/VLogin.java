/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author sistem
 */

public class VLogin extends JFrame {

    JLabel user = new JLabel("Username");
    JLabel pass = new JLabel("Password");
    JTextField us = new JTextField(20);
    JTextField pa = new JTextField(20);
    JButton login = new JButton("Login");
    JButton batal = new JButton("Batal");

    VLogin() {
        setTitle("Yok Login Yok!");
        setSize(350, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        add(user);
        add(us);
        add(pass);
        add(pa);
        add(login);
        add(batal);

    }
}
