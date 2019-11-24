package MyPackage;

public class TrippleDice {
	
		private  Dice D1,D2,D3;
		public  int Throw()
		{
			D1=new Dice();
			D2=new Dice();
			D3=new Dice();
			int randomDice;
			randomDice = (D1.Throw()+D2.Throw()+D3.Throw());			
			return randomDice;
		}
		public String toString()
		{
			return String.format("Random number of 3 dice is : %d", Throw());
		}
	}

}
