package DiceClass;

public class DiceTest extends Dice
{
	public DiceTest()
	{
		super();
	}

	// Creates two Dice objects and rolls them several times.
	public static void main(String[] args) 
	{
		Dice D1, D2, D3;
		
		D1 = new Dice(0);
		D2 = new Dice(0);
		D3 = new Dice(0);
		
		D1.Throw();
		D2.Throw();
		D3.Throw();
		System.out.println("Dice One: " + D1 + " Dice Two: " + D2 + " Dice Three: " + D3);
	}
}
