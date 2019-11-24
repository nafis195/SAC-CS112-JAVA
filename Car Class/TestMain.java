import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		Automobile userCar = new SportsCar (2016, "Ferrari", "Enzo", "Red", "Speedy", 6, 0.25);
		
		System.out.println("\nYou created the follow Automobile:"+userCar);
		
		System.out.print("\nEnter the number of dices to determine Operating Cycles: "); 
		int operatingCycle = Dice.Throw(input.nextInt());
		
		System.out.println("Operating Cycles = "+operatingCycle);
		System.out.printf("Press 1 to take %s for a test drive: ", userCar.getName());
		int testDrive = input.nextInt();
		
		for (int count=1; count <= operatingCycle; count++)
		{	
			userCar.drive (count);
			System.out.print(userCar);
		}
	}
}