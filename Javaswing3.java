/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing3;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author User
 */
public abstract class Javaswing3 implements ActionListener {

    /**
     * @param args the command line arguments
     */
    private static void createAndShowGUI() {
        // make frame...
        JFrame frame = new JFrame("i am a JFrame"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20,30,300,100);
        frame.getContentPane().setLayout(null);
        //make a button
        JButton butt=new JButton("Click me");
        frame.getContentPane() .add(butt);
        butt.setBounds(20,20,200,20);
        
        //instantiate an application object
        Javaswing3 app = new Javaswing3() {};
        //make the label
        app.label = new JLabel("nama tidak terdeteksi");
        app.label.setBounds(20,40, 200,20);
        frame.getContentPane().add(app.label);
        
        // set the application object to be the thing which
        // listens to the button
        butt.addActionListener (app);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
{ 
    //ini akan dieksekusi ketika button diklik
    label.setText("gege cantik");        
}
    public static void main(String[] args) {
        //memulai swing GUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    //aplication object fields
    //int clickCount=0;
    JLabel label;
}
