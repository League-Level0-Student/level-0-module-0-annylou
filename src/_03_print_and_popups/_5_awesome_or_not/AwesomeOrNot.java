package _03_print_and_popups._5_awesome_or_not;

import javax.swing.JOptionPane;

import java.util.Random;

public class AwesomeOrNot {


	// 1. Make a main method that includes everything below
	public static void main(String[] args) {
		
	
	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
		int number;
	
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
		number = ran.nextInt(4);
		// 3. Print your variable to the console
		System.out.println(number);
		// 4. Get the user to enter something that they think is awesome
		String something = JOptionPane.showInputDialog("enter something you think is awesome");
		// 5. If your variable is  0
		if(number == 0) {
			JOptionPane.showMessageDialog(null, "that's awesome");
		}
			// -- tell the user whatever they entered is awesome!
	
		// 6. If your variable is  1
		if(number == 1) {
			JOptionPane.showMessageDialog(null, "that's okay");
		}
			// -- tell the user whatever they entered is okay.
	
		// 7. If your variable is  2
		if(number == 2) {
			JOptionPane.showMessageDialog(null, "that's boring");
		}
			// -- tell the user whatever they entered is boring.
	
		// 8. If your variable is  3
		if(number == 3) {
			JOptionPane.showMessageDialog(null, "that's sad");
		}
			// -- invent your own message to give to the user (be nice).
	}
}
