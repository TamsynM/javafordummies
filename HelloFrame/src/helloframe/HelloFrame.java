/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloframe;

import javax.swing.*;

/**
 *
 * @author tamurphy
 */
public class HelloFrame extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new HelloFrame();
    }
    
    public HelloFrame()
    {
        this.setSize(250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hellow World!");
        
        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("Hello World!");
        panel1.add(label1);
        this.add(panel1);
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        
    }
    
}
