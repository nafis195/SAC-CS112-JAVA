public abstract class Automobile implements Drive {
	
	private int year;
	private String make;
	private String model;
	private String color;
	private String name;
	private int numOfGears;
	private int currentGear=0;
	private int operatingCycle=0;
	private double currentSpeed=0;
	private double distanceTraveled=0.0;

	public Automobile (int year, String make, String model, String color, String name, int numOfGears)
	{
		this.year = year;
		this.make = make;
		this.model = model;
		this.color = color;
		this.name = name;
		this.numOfGears = numOfGears;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	public void setMake(String make)
	{
		this.make = make;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setNumOfGears (int numOfGears)
	{
		this.numOfGears = numOfGears;
	}
	public int getNumOfGears()
	{
		return numOfGears;
	}
	public void setOperatingCycle(int cycle)
	{
		operatingCycle = cycle;
	}
	public int getOperatingCycle()
	{
		return operatingCycle;
	}
	public void increaseGear ()
	{
		currentGear++;
	}
	public double getDistanceTraveled()
	{
		return distanceTraveled;
	}
	public void setDistanceTraveled (double n)
	{
		distanceTraveled = n;
	}
	public void setCurrentGear (int c)
	{
		currentGear = c;
	}
	public int getGear()
	{
		return currentGear;
	}
	public double getSpeed()
	{
		return currentSpeed;
	}
	public void setSpeed(double n)
	{
		currentSpeed = n;
	}
	public String toString()
	{
		return String.format("\nYear: %d, Make: %s, Model: %s, Color: %s, Name: %s, Num of Gears: %d, Op Cycle: %d,"
				+ " Current Gear: %d, Current Speed: %.0f, Distance Traveled: %.2f", 
				year, make, model, color, name, numOfGears, operatingCycle, currentGear, currentSpeed, distanceTraveled);
 	}

}