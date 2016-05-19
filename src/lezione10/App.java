/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione10;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author tss
 */
public class App {

    public static void main(String[] args) {

        JFrame f = new JFrame("esempio swing");

        f.setBounds(100, 100, 300, 200);//posizione, larghezza, altezza
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//servere per chiudere il run con la crocetta

        Container contentPane = f.getContentPane(); // dichiaRO UN CONTAINER e vado a agganciare la parte di content del frame che ho fatto 

        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT)); //con "null" metto il posizionamento assoluto 
                                       // flow layout posiziona a partire da sx
        
        
        JButton cmd = new JButton("invia");
        
        cmd.setBounds(50, 50, 70, 30);
        contentPane.add(cmd);
        
        JButton cmd1 = new JButton("andiamo a casa");
        cmd1.setPreferredSize(new Dimension(100, 50));
        
        contentPane.add(cmd1);
        
        
        f.setVisible(true);

    }
}
