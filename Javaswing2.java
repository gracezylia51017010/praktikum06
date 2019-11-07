/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing2;

/**
 *
 * @author User
 */
import javax.swing.*;
public class Javaswing2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("title");
            JPanel p = new JPanel();
            JButton b = new JButton("press me");
            
            f.setSize(400,400);
            
            p.add(b);
            f.setContentPane(p);
            
            f.show();
    }
    
}
