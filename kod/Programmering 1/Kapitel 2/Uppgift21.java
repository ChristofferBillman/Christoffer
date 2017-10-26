/*
Ett program som ska innehålla 4 variabler och printa mitt namn, adress och telefonnummer.

Christoffer Billman

2017-09-18
*/


import javax.swing.*;

public class Uppgift21{
	public static void main(String[] args) {
		String name, adress, phone, viewedtext;
            name = "Christoffer Billman\n";
            adress = "Grubbevagen 75\n";
            phone = "0705772297";
                viewedtext = name + adress + phone;
            JOptionPane.showMessageDialog(null,viewedtext);
    }
    
    

} 