
public class Dice {

	public static int Throw (int dices)
	{
		int diceNum = dices * (1 + (int)(Math.random()*6));
		return diceNum;
	}
}
