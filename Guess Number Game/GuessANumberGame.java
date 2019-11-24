import java.util.Scanner;

public class GuessANumberGame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// Variables declaration
		int guessNumber = 0;
		int youTried = 0;
		int youWon = 0;
		int youLost = 0;
		int computerNum = 0;
	
	// Condition
	boolean success = false;	
	// Please try !success	
	 while (success == false)	 
	 {
        System.out.println("Please enter an integer betwen 1 and 10: ");
        guessNumber = input.nextInt();
        youTried = youTried + 1;

        // Condition for good guess
        if (guessNumber == computerNum){
        	System.out.println("Good guess.");
        	youWon = youWon + 1;
       }
        
        // Condition for bad guess
        else if (guessNumber != computerNum){	
        	System.out.println("Bad guess");
        	youLost = youLost + 1;
       }
     
     // Show output to user how many times he tries, win & lose
	 System.out.println("You tried " + youTried + " times.");
	 System.out.println("You win " + youWon + " times.");
	 System.out.println("You lose " + youLost + " times.");

	 // Condition for terminate the program
	 if (guessNumber < 0 || guessNumber > 10) {
		success = true;
	 }
	}

 }
}
