
package dicegame3;

import java.util.Random;
public class gameHistory 
{
    private static int diceVlaue;
    private static int throwNumbers;
    private static int dieNumbers; 
    private static int correctGuessTackers;
    private static int totalDiceThrowns;
    private static int numberofDieRolledMessage;
    
    public static void numberofDieRolledMessage(int numberofDie)
    {
        if (numberofDie == 1)
        {
           System.out.println("The Die Has Been Rolled"); 
        }
        else
        {
           System.out.println("The Dice Have Been Rolled");
        }
    }
    public static int oneThrow(int lowestValue, int highestValue) 
    {
        lowestValue = lowestValue * dieNumbers;
        highestValue = highestValue * dieNumbers;
        Random rand = new Random();
        int diceVlaue = lowestValue + (int)(Math.random() * ((highestValue - lowestValue) + 1));
        return diceVlaue;
    }
    
    
    public static void dieSelecter(int dieNumber)
    {
        dieNumbers = dieNumber; 
    }
    
    public static void throwTracker(int throwNumber)
    {
        throwNumbers = throwNumber; 
        System.out.println("Number of Throws: " + throwNumbers );
    }
    
    public static void correctGuessTacker(int correctGuessTacker)
    {
        correctGuessTackers = correctGuessTacker; 
        System.out.println("Number Correct Guesses: " + correctGuessTackers);
    }
    
    public static void totalDiceThrown(int totalDiceThrown)
    {
        totalDiceThrowns = totalDiceThrown; 
        System.out.println("Number of Die Thrown: " + totalDiceThrown );
    }
    
}

