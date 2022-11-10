package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
int points = 0;	
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
String one = JOptionPane.showInputDialog("what is one plus one");			
				// 3.  Use an if statement to check if their answer is correct
if(one.equals ("two")) {
points+=1;
}
				// 4.  if the user's answer was correct, add one to their score 
else {
points-=1;		
}

String two = JOptionPane.showInputDialog("how do you spell window");
if(two.equals ("window")) {
points+=1;
}
else {
points-=1;
}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
JOptionPane.showMessageDialog(null, "your points are " +points);
	}
}
