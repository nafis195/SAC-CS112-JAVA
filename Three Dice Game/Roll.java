package myProject;

import java.util.Random;

public class Roll {
    public int GetANumber(int DiceNumber) {
        int randomNumber = 1; // int for dice 1
        
        if(DiceNumber == 1){ // if user chose to throw 1 dice
            randomNumber = 1 + (int) ( Math.random() * 6);}
        else{
            if(DiceNumber == 2) { // if user chose to throw 2 dices
                randomNumber = 2 + (int) ( Math.random() * 12);}
            else{
                if(DiceNumber == 3) { // if user chose to throw 3 dices
                    randomNumber = 3 + (int) ( Math.random() * 18);}
                // number not between 1-3
                else {                    
                    randomNumber = 0;}
            }
        }
        System.out.println("The random number is " + randomNumber); // displays random number
        return randomNumber;
    }
}