//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser { 
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot jeff = new Robot();
		//3. Ask the user what color they would like the robot to draw
		for (int i = 0; i < 9999999; i++) {
		String cheese = JOptionPane.showInputDialog("What color would you like to draw with?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (cheese.equals("blue")) {
			jeff.setPenColor(Color.blue);
		}
		else if (cheese.equals("yellow")) {
			jeff.setPenColor(Color.yellow);
		}
		else if (cheese.equals("red")) {
			jeff.setPenColor(Color.red);
		} else {
			jeff.setRandomPenColor();
		}
        //6. If the user doesn’t enter anything, choose a random color
//up above
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
//up above
		//4. Set the pen width to 10
		jeff.penDown();
	    //2. Make the robot draw a shape (this will take more than one line of code)
jeff.hide();
jeff.penDown();
jeff.setSpeed(25);
jeff.move(100);
jeff.turn(120);
jeff.move(100);
jeff.turn(120);
jeff.move(100);
jeff.turn(120);
		}
	}
}
