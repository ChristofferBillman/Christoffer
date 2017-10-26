/*
Ett program som ska fråga efter för och efternamn och sedan visa det.

Christoffer Billman

2017-09-18
*/


import javax.swing.*;

public class Uppgift23{
	public static void main(String[] args) {
        
		String firstname, surname, greeting;
           
            firstname = JOptionPane.showInputDialog("What's your first name?");
            surname = JOptionPane.showInputDialog("What's your surname?");
            greeting = "Welcome " + firstname + " " + surname + ".";
        
        JOptionPane.showMessageDialog(null, greeting);
    }
    
    

} 