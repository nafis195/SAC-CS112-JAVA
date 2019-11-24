import java.util.Scanner;

public class RockPaperScissor {

     static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) {
	
	int firstPlayer, secondPlayer;
	
	System.out.println("Please enter 0 for rock, 1 for paper & 2 for scissor");
	
	System.out.print("First Player Choice:- ");
	firstPlayer = sc.nextInt();
	
	System.out.print("Second Player Choice:- ");
	secondPlayer = sc.nextInt();
	
	if (firstPlayer == 0 && secondPlayer == 0) {
		System.out.print("Game Tie");
		}
	else if (firstPlayer == 1 && secondPlayer == 1) {
		System.out.print("Game Tie");
		}
	else if (firstPlayer == 2 && secondPlayer == 2) {
		System.out.print("Game Tie");
		}
	else if (firstPlayer == 0 && secondPlayer == 1) {
		System.out.print("Second player win the game.");
		}
	else if (firstPlayer == 1 && secondPlayer == 0) {
		System.out.print("First player win the game.");
		}
	else if (firstPlayer == 0 && secondPlayer == 2) {
		System.out.print("First player win the game.");
		}
	else if (firstPlayer == 2 && secondPlayer == 0) {
		System.out.print("Second player win the game.");
		}
	else if (firstPlayer == 1 && secondPlayer == 2) {
		System.out.print("Second player win the game.");
		}
	else if (firstPlayer == 2 && secondPlayer == 1) {
		System.out.print("First player win the game.");
		}
	else {
		System.out.print("Sorry!!! Wrong Input");
	}
	
	}

}
