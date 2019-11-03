package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	
	//1. make a main method
	
	
		//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.
	
			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

public static void main(String[] args) {
	Robot[] array = new Robot[5];
		
	for(int i = 0; i<array.length; i++) {
		array[i] = new Robot();
		
		array[i].setX(80+(100*(i+1)));
		array[i].setY(550);
	}
	boolean finished = false;	
	while(!finished) {
	for(int i=0;i<array.length;i++) {
		if(array[i].getY()<0) {
			finished = true;
			JOptionPane.showMessageDialog(null, "Robot " + i + "is the winner!");
		}
		else {
			
		
		Random rdm = new Random();
		int movement = rdm.nextInt(50);
		
		array[i].move(movement);
		}
	}
	}
	
	
		
		
	}
}
