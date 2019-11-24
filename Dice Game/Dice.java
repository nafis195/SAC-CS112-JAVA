package myProject;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Dice {
       public static void main(String[] args) {
        // Displays message to user
        JOptionPane.showMessageDialog( null, "Want to play guess number dice game?");
        
        int [] ArraysToHoldValues = new int [6]; // int for row of arrays
            ArraysToHoldValues[0] = 0;// Stores number of game played
            ArraysToHoldValues[1] = 0;// Stores remainer of user's guess
            ArraysToHoldValues[2] = 0;// Stores number of odd guess
            ArraysToHoldValues[3] = 0;// Stores how many right guess user made
            ArraysToHoldValues[4] = 1; // Stores whether user wants to play the game again (1 = yes)
            ArraysToHoldValues[5] = 1; // Stores how many dice user wants to throw (among 1,2,3)
             
        do //do-while loop
        {
            // asks user how many dice they want to throw 1, 2, or 3
            int DiceNumber =
                Integer.parseInt( JOptionPane.showInputDialog("Lets start!\n"
                        + "Pick between 1 to 3 dice to roll?"));
            ArraysToHoldValues[5] = DiceNumber;
            System.out.println("You picked to throw " + DiceNumber + " dice(s)");
            
            Roll randomNum = new Roll();
            int randomNumber;
            randomNumber = randomNum.GetANumber(DiceNumber);
                                 
            // Prompts user to guess
            String UserGuessStr =
                    JOptionPane.showInputDialog("Guess total points from dice(s) thrown?:");
            int UserGuessInt = Integer.parseInt(UserGuessStr); 
            System.out.println("Your guess is " + UserGuessInt); // Display user's guess
            
            if (randomNumber == UserGuessInt) //if randomNumber is UserGuessInt
            {
                JOptionPane.showMessageDialog( null, "Congrats! You win!");
                
                ArraysToHoldValues[3] = ArraysToHoldValues[3] + 1;//counts right guesses
            }
            else
            {
                JOptionPane.showMessageDialog( null, "Sorry. You lose"); // displays when guess is wrong
            }
            ArraysToHoldValues[0] = ArraysToHoldValues[0] + 1; // games played
            int [] GameStatus = {ArraysToHoldValues[0],ArraysToHoldValues[3],ArraysToHoldValues[2]};
            
           //game stats and asks user if they want to play again
            String PlayAgainStr =
                JOptionPane.showInputDialog("Game stat:\n"
                        + "Number of games played is " + ArraysToHoldValues[0]
                        + ".\nNumber of correct guesses is %" + (float)ArraysToHoldValues[3]/ArraysToHoldValues[0]*100
                        + ".\n\nWant to play it again?\nPress 1 to play again \nor press 2 to quie:");
            ArraysToHoldValues[4] = Integer.parseInt(PlayAgainStr);  
        } while (ArraysToHoldValues[4] == 1);
        JOptionPane.showMessageDialog( null, "See you next time. Bye!");
    } 
}