/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing4;

/**
 *
 * @author User
 */
import javax.swing.*;
import java.awt.event.*;


public abstract class Javaswing4 implements ActionListener{

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
        Javaswing4 app = new Javaswing4() {};
        //make the label
        app.label = new JLabel("0 clicks");
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
    ClickCount++;
    label.setText("Clicks = "+ClickCount);        
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
    int ClickCount= 0;
    JLabel label;
}
