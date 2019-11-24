
package dicegame3;
import java.util.Scanner;

public class DiceGame3 {

    
    public static void main(String[] args) 
    {
        int totalDiceThrown = 0; 
        int throwCounter = 0;
        int userRollGuess; 
        int correctGuessCounter = 0; 
        int rolledNumber;
        boolean restart = true;
        
        Scanner scan = new Scanner(System.in);
        
        while (restart)
        {
            System.out.println("How Many Die Do You Want to Roll ");
            int numberOfDie = scan.nextInt();

            gameHistory.dieSelecter(numberOfDie);
            gameHistory.numberofDieRolledMessage(numberOfDie);


            System.out.print("What Number Was Rolled: ");
            userRollGuess = scan.nextInt();

            System.out.print("The Die Has Landed On: ");
            rolledNumber = gameHistory.oneThrow(1,6);
            System.out.print(rolledNumber);
            System.out.println("");

            if (userRollGuess == rolledNumber)
            {
                System.out.println("That is CORRECT!");
                System.out.println("");
                correctGuessCounter++;
            }
            else 
            {
                System.out.println("That is Incorrect!");
                System.out.println("");
            }

            throwCounter++;
            totalDiceThrown += numberOfDie;

            gameHistory.totalDiceThrown(totalDiceThrown);
            gameHistory.throwTracker(throwCounter);
            gameHistory.correctGuessTacker(correctGuessCounter);

            while(true)
            {
                System.out.print("Would You Like To Play Again?: ");
                String replay = scan.next();
                if (replay.equalsIgnoreCase("yes"))
                {
                    restart = true;
                    break;
                }
                else if (replay.equalsIgnoreCase("no"))
                {
                    restart = false; 
                    break;
                }
                else 
                {
                    System.out.println("Invalid Input ENTER Only 'Yes' or 'No' ");
                    continue; 
                }
            }
        }
    } 
}
