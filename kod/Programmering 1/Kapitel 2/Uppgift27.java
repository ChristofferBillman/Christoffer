/*
Skriva speciella karaktärer.

Christoffer Billman

2017-09-18
*/


import javax.swing.*;

public class Uppgift27{
	public static void main(String[] args) {
        
        char c1, c2, c3;
            c1 = '\u00D8'; 
            c2 = '\u00F8';
            c3 = '\u03C0';
        
        JOptionPane.showMessageDialog(null, c1);
        JOptionPane.showMessageDialog(null, c2);
        JOptionPane.showMessageDialog(null, c3);
        
  }
}