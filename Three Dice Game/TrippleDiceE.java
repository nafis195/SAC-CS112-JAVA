import java.util.Random;

public class Dice {
	// member of instance variables
	int numOfDice = 0;
	int valueOfRoll = 0;
	String history = "";

	// constructor that takes in the amount of dice as a parameter
	public Dice(int amount) {
		numOfDice = amount;
	}

	// method setting the number of dice
	public void SetDices(int amount) {
		numOfDice = amount;
	}

	// method generating the value of rolling the dice
	public int roll() {
		Random random = new Random();
		valueOfRoll = random.nextInt(numOfDice * 6) + 1;
		history = history + valueOfRoll;
		return valueOfRoll;
	}

	// returning the last value rolled
	public int ValueOfRoll() {
		return valueOfRoll;
	}

	public String history() {
		return history;

	}

	// Overriding the ToString() method to your own custom ToString() method
	@Override
	public String toString() {
		return "SetDiceClass [getClass()=" + ", toString()=" + super.toString() + "]";
	}
}














import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		// variables
		String input = ""; // to hold user's input

		int num = 0;// to hold the number of dice
		int answer = 0;// initiating a variable to hold the system number
		TrippleDice threedice = new TrippleDice(4);
		TrippleDiceE threediceE = new TrippleDiceE(4);
		threedice.toString();
		threediceE.toString();
		threediceE.Throw();
		threediceE.Throw();
		threediceE.Throw();
		threediceE.Throw();
		do {
			// asking the user how many dice he/she would like, as well as
			// giving the user a chance to quit
			System.out.println("Please enter the number of dice you would like? (you may enter q to quit)");
			// reading the user's input
			Scanner scanner = new Scanner(System.in); // to read in user's input
			input = scanner.nextLine();
			// checking to see if the user would like to quit
			if (input.toLowerCase().equals("q")) {
				break;
			}
			// saving the number of dice the user wants in a variable called
			// dice
			try {
				num = Integer.parseInt(input);
			} catch (Exception e) {
				System.out.println("That's not a number, please try again.");
				continue;
			}
			// using a constructor to create a dice object with the number of
			// dice the user desires
			Dice dice = new Dice(num);
			// generating a system number
			answer = dice.roll();

			do {
				System.out.println("Please guess a number: ");
				num = scanner.nextInt();

			} while (num != answer); // checking to see if the user has guessed
										// the correct number

		} while (true);

	}
}

















public class TrippleDice extends Dice {
	public TrippleDice(int amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}

	// This is TrippleDice's toString method .
	@Override
	public String toString() {
		return "This is TrippleDice's toString method :" + super.toString();
	}
}




















public class TrippleDiceE extends TrippleDice {

	public TrippleDiceE(int amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}

	int NumofThrows = 0;

	// The NumofThrows in the Throw method will increase by 1
	public void Throw() throws Exception {
		NumofThrows = NumofThrows + 1;
		if (NumofThrows <= 4) {
			System.out.println("You have thrown too many times!");
			throw new Exception();
		}

	}

	// "This is TrippleDiceE's toString method "
	@Override
	public String toString() {
		return "This is TrippleDiceE's toString method :" + super.toString();
	}
}