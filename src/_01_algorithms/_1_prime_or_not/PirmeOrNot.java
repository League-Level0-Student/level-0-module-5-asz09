package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PirmeOrNot {
public static void main(String[] args) {
	boolean isPrime = true;
	String stringNumber = JOptionPane.showInputDialog("Give me a number, any number!");
 int input = Integer.parseInt(stringNumber);
 for(int i = 2; i<input; i++) {
	 if(input %i == 0) {
		 JOptionPane.showMessageDialog(null, "This number is not prime");
		 isPrime = false;
		 
		 break;
	 }
	 
 }
 if(isPrime ==true) {
	 JOptionPane.showMessageDialog(null,"This number is prime!");
 }
}
	
	
}
