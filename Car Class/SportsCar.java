
public class SportsCar extends Automobile{
	
	private double turboBoost=0;
	private double currentBoost = 0;
	
	public SportsCar (int year, String make, String model, String color, String name, int numOfGears, double turboBoost)
	{
		super (year, make, model, color, name, numOfGears);
		this.turboBoost = turboBoost;
	}
	
	@Override
	public void drive (int opCycle)
	{
		setOperatingCycle(opCycle);
		if (getGear() < getNumOfGears())
		{
			increaseGear();
			setSpeed(getGear()*10);
		}
		else if (getGear() == getNumOfGears())
		{
			setSpeed((getGear()*10) * (1 + turboBoost));
			currentBoost = turboBoost;
		}
		setDistanceTraveled (getDistanceTraveled() + getSpeed()/60.0);
	}
	
	@Override
	public String toString()
	{
		double turboBoostPercent = currentBoost *100;
		return String.format("%s, TurboBoost: %.0f%%",
				super.toString(), turboBoostPercent);
	}
}