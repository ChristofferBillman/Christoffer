import javax.swing.*;
 public class Uppgift82{
	public static void main(String[] args) {
        int leap;
        int yr = Integer.parseInt(JOptionPane.showInputDialog("What year?"));
        JOptionPane.showMessageDialog(null, isLeapYr.isLeapYr(yr));
    }
}
class isLeapYr {
    public static boolean isLeapYr (int yr) {
   if ((yr % 4 == 0 && yr % 100 !=0) || yr % 400 == 0){
     return true;  
   } else {
       return false;
   }
       
}
}