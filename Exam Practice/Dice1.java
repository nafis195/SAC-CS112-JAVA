package DiceClass;
import java.util.Random;

public class Dice 
{
	int dice1 = 0;
	int dice2 = 0;
	int dice3 = 0;
	int diceSum = 0;
	static String lastDiceValue = null;
	static int Roll = 0;
	int numOfDice = 0;
	private int faceValue; // current value showing on the dice
	
	Random random = new Random();

	// Constructor to initialize the number of dice to throw
	public Dice(int diceCount) 
	{
		numOfDice = diceCount;
		numOfDice++;
		dice1 = random.nextInt(6) + 1;
		numOfDice++;
		dice2 = random.nextInt(6) + 1;
		numOfDice++;
		dice3 = random.nextInt(6) + 1;
		
		Roll = dice1 + dice2 + dice3;
	} // end constructor
	
	public Dice() 
	{
	}

	public void Throw()
	{
		diceSum = random.nextInt(Roll) + 1;
	}
	
	public int getThrow(int num)
	{
		diceSum = Roll;
		System.out.println("Sum of all dice = " + diceSum);
		
		if(diceSum <= 3)
		{
			diceSum = 1;
		}
		else if(diceSum >=4)
		{
			diceSum = 6;
		}
		return diceSum;
	}
		
	// Returns a the number of dice rolled and the last value rolled
	public String toString(int diceSum)
	{
		numOfDice = diceSum;
		System.out.println("\nThe number of dices = " + numOfDice);
		lastDiceValue = Integer.toString(Roll);
		System.out.println("The last roll value = " + lastDiceValue);
		return lastDiceValue;
	} // end toString method
} // end class Dice
