/*
Skriva kommentarer i programmet från förra uppgiften.

Christoffer Billman

2017-09-18
*/


import javax.swing.*;

public class Uppgift25{
	public static void main(String[] args) {
        
		String firstname, surname, greeting; //Deklarerar variabler
           
            firstname = JOptionPane.showInputDialog("What's your first name?"); //Frågar om förnamn
            surname = JOptionPane.showInputDialog("What's your surname?"); //Frågar om efternamn
            greeting = "Welcome " + firstname + " " + surname + "."; //Lägger ihop informationen vi samlat från användaren till en variabel.
        
        
        JOptionPane.showMessageDialog(null, greeting); //Skriver ut variablen och visar användaren dess för och efternamn.
    }
    
    

} 