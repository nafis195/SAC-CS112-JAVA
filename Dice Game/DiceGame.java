	import java.util.Scanner;
	
public class DiceGame {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
			
		int [] diceNumber = {1,2,3,4,5,6};
		int guess = 0;
		int count = 0;
		int game = 1;
		int again = 0;
		int even = 0;
		int odd = 0;
		int win = 0;
		int lose = 0;
		float percentage;
				
			System.out.println("You will have 3 tries per game to guess if the dice number is even or odd");
				
				do{
					System.out.printf("Thisis is game %d\n",game);
			
					for (int i = 1; i < 4; i++)
					{
						System.out.printf("This is match %d\n",i);
						
						System.out.print("Enter (1) for even or (0) for odd: ");
						guess = input.nextInt();
						
						diceNumber[i] = 1 + (int) (Math.random() * 6);
				
						if (diceNumber[i]%2 == 0 && guess == 1)
						{
						System.out.printf("You chose %d for even\n",guess);
						
						System.out.printf("The number generated was %d, It's even you win!\n",diceNumber[i]);
						even++;
						win++;
						count++;
						}
						if(diceNumber[i]%2 != 0 && guess == 0)
						{
						System.out.printf("You chose %d for odd\n",guess);
					
						System.out.printf("The number generated was %d, It's odd you win!\n",diceNumber[i]);
						odd++;
						win++;
						count++;
					}
					if (diceNumber[i]%2 == 0 && guess == 0)
					{
						System.out.printf("You chose %d  for odd\n",guess);
						
						System.out.printf("The number generated was %d It's even you lose\n",diceNumber[i]);
						even++;
						lose++;
						count++;
					}
					if(diceNumber[i]%2 != 0 && guess == 1)
					{
						System.out.printf("You chose %d for even\n",guess);
						System.out.printf("The number generated was %d, It's odd you lose\n",diceNumber[i]);
						odd++;
						lose++;
						count++;
					}
				}
				
				System.out.print("Would you like to play another game? (1)yes or (0)no: ");
				again = input.nextInt();
				
				if (again == 0)
				{
					percentage = (float) ((win * 100) / count);
					
					System.out.printf("The total number of games you played were %d\n",game);
					
					System.out.printf("The total number of matches played were %d\n",count);
					
					System.out.printf("The total number of times you won were %d\n",win);
					
					System.out.printf("The total amount of times you lost were %d\n",lose);
					
					System.out.printf("The system generated %d number of even(s) and %d number of odd(s)\n",even,odd);
					
					System.out.print("Your total winning percentage was " + percentage + "%\n");
					
					System.out.println("Thank you for playing, Good-bye");
				}
				game++;
			}while(again == 1);
	}
}

