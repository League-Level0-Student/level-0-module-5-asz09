package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	public static void main(String[] args) {
		Robot rob = new Robot();
		drawSquare(rob);
		drawTriangle(rob);
	}

	
	private static void drawTriangle(Robot rob) {
		// TODO Auto-generated method stub
		
	}


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

		
	static void drawTriangle(Robot rob1){
		rob1.penDown();
		rob1.setSpeed(40);
		rob1.move(200);
		rob1.turn(60);
		rob1.move(200);
		rob1.turn(60);
		
			
			
		}
	}
		
		
}
