
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "March 1st";
		String dadsBirthday = "March 27th";
		String myBirthday = "September 6th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String day = JOptionPane.showInputDialog("Which birthday would you like to see?");
		// 3. Print out what the user typed
		System.out.println(day);
		// 4. if user asked for "mom"
			if(day.equals("mom")) {
				System.out.println(momsBirthday);
			}
				//print mom's birthday
		// 5. if user asked for "dad"
			if(day.equals("dad")) {
				System.out.println(dadsBirthday);
			}
			// print dad's birthday
		// 6. if user asked for your name
			else if(day.equals("my")) {
				System.out.println(myBirthday);
			}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
			else {
				JOptionPane.showMessageDialog(null,"Sorry, i don't remember that person's birthday!");
			}
	} 
}
