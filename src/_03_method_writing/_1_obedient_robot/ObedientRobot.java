package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	public static void main(String[] args) {
		Robot rob = new Robot();
		drawSquare(rob);
		drawTriangle(rob);
			
	

	}

private static void drawCircle(Robot rob) {
		// TODO Auto-generated method stub
		
	}

// JOptionPane.showInputDialog("Which shape do you want?");

	static void drawSquare(Robot rob){
		rob.penDown();
		rob.setSpeed(30);
		rob.move(200);
		rob.turn(90);
		rob.move(200);
		rob.turn(90);
		rob.move(200);
		rob.turn(90);
		rob.move(200);
		rob.penUp();
			
		
		}
	
	
static void drawTriangle(Robot rob) {
	rob.penDown();
	rob.setSpeed(30);
	rob.move(200);
	rob.turn(60);
	rob.move(200);
	rob.turn(120);
	rob.move(200);
	rob.turn(120);
	rob.move(200);
	rob.penUp();
	}
	
static void drawCircle1(Robot rob) {
	rob.penDown();
	rob.move(200);
	rob.turn(20);
	rob.move(200);
	rob.turn(20);
	
}
		
}
