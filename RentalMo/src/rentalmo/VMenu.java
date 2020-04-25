/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmo;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author sistem
 */
public class VMenu extends JFrame{
    JMenuBar jb;
    JMenu jm1,jm2,jm3;
    JMenuItem ji1,ji2,ji3,ji4,ji5,ji6;
    
    VMenu(){
        setTitle("Data Jenis Motor");
        setSize(500,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setJMenuBar(jb);
        
        jb = new JMenuBar();
        jm1 = new JMenu("Master");
        jm2 = new JMenu("Transaksi");
        jm3 = new JMenu("Logout");
        ji1 = new JMenuItem("Data Member");
        ji2 = new JMenuItem("Data Motor");
        ji3 = new JMenuItem("Data Jenis Motor");
        ji4 = new JMenuItem("Data Peminjaman");
        ji5 = new JMenuItem("Data Pengembalian");
        ji6 = new JMenuItem("Logout");
        jb.add(jm1);
        jb.add(jm2);
        jb.add(jm3);
        jm1.add(ji1);
        jm1.add(ji2);
        jm1.add(ji3);
        jm2.add(ji4);
        jm2.add(ji5);
        jm3.add(ji6);
    }
}
