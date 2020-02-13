package _04_are_you_happy;

import javax.swing.JOptionPane;

public class Happy {
public static void main(String[] args) {
	String one = JOptionPane.showInputDialog("Are you happy?");	
if(one.contentEquals("no")) {
	String two = JOptionPane.showInputDialog("Do you want to be happy?");
	if(two.contentEquals("no")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
	}
	else if(two.contentEquals("yes")) {
		JOptionPane.showMessageDialog(null, "Change something.");
	}
}
else if(one.contentEquals("yes")) {
	JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
