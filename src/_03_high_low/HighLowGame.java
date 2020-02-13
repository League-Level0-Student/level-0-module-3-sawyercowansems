//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _03_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		
		// 2. Print out the random variable above
		System.out.print(random);
		// 11. Repeat steps 1 to 10 ten times
		for (int i = 0; i < 10; i++) {
			
			// 1. Ask the user for a guess using a pop-up window, and save their response 
String wires = JOptionPane.showInputDialog("Guess a number?");
			// 4. Convert the users answer to an int (Integer.parseInt(string))
int why = Integer.parseInt(wires);			
			// 5. if the guess is correct
if (why == random) {
	JOptionPane.showMessageDialog(null, "WINNER");
	System.exit(0);
}
else if (why > random) {
	JOptionPane.showMessageDialog(null, "Thats too high!");
}
else if (why < random) {
	JOptionPane.showMessageDialog(null, "Thats too low!");
}
				// 6. Win
//done
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
//done
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low
//done
		}
		// 13. Tell them they lose
		JOptionPane.showMessageDialog(null, "You lose!");
	}

}


