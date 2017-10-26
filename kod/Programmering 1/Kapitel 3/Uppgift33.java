/*
Rärnar ut en cirkels omkrets och area med hjälp 

Christoffer Billman

2017-10-16
*/

import javax.swing.*;

public class Uppgift41{
	public static void main(String[] args) {
       
       double r = Double.parseDouble(JOptionPane.showInputDialog("Radius of circle? (cm)"));
        r = circle.area(r);
        JOptionPane.showMessageDialog(null, r);
    }
    
}
class circle {
    public static double circumfrence() {
        
    }
    public static double area(double r) {
        return r * 2;
    
    }
}