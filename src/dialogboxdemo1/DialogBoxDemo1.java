/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogboxdemo1;

import javax.swing.JOptionPane;


public class DialogBoxDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Please enter your first and last name");
        JOptionPane.showMessageDialog(null, "Hello " + name);
        
        String nName = JOptionPane.showInputDialog(null, "Did you like seing your name? Yes or No");
        JOptionPane.showMessageDialog(null,name + " Selected " + nName);
        
        String input = JOptionPane.showInputDialog(null, "Hello " + name + "please enter your current age");
        int age = Integer.parseInt(input);
        JOptionPane.showMessageDialog(null,"OK " + name + " Next year you will be " +  ++age);
        
        
    }
    
}
