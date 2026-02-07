 package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	static int happinessValue;
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		while(happinessValue<100) {
			happinessValue=0;
		}
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
JOptionPane.showMessageDialog(null,"Click enter to begin");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "How do you want to care for your pet?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Replenish Food and Water", "Go for a Walk", "Cuddle", "Clean up Poop"}, null);

			// 6. Use user input to call the appropriate method created in step 5 below.

			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if(task==0) {
	replenishFood();{
		
	}
		
	
}
	}

	private static void replenishFood() {
		happinessValue=0+1;
		
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.

}