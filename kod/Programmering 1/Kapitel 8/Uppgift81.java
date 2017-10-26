/*
Rärnar ut en cirkels omkrets och area med hjälp av radien.

Christoffer Billman

2017-10-16
*/

import javax.swing.*;

public class Uppgift81{
	public static void main(String[] args) {
       
        double r = Double.parseDouble(JOptionPane.showInputDialog("Radius of circle? (cm)"));
        
        double c = Circle.circumfrence(r);
        double a = Circle.area(r);
        
        JOptionPane.showMessageDialog(null, "Circumfrence: " + c);
        JOptionPane.showMessageDialog(null, "Area: " + a);
    }
    
}
class Circle {
    
    public static double area(double r1) {
        return r1 * r1 * Math.PI; 
    }
    
        public static double circumfrence(double r1) {
            return r1 * 2 * Math.PI;
        }
}
