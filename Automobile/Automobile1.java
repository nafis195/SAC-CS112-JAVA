public class Automobile<OverToString> {
	private String Name, HornSound, Color;
	private int Doors, Cylinders;

	public Automobile(String name, String color, int doors, int cylinders, String hornSound, car OverToStringObject,
			Object mOverToStringObject) {
		Name = name;
		Color = color;
		Doors = doors;
		Cylinders = cylinders;
		HornSound = hornSound;
		HornSound = "Boom!";
		car carObject = new car();
		OverToStringObject.Displaymessage();

	}

	public String description() {
		String type = " " + Name + " " + Color + " " + Doors + " " + Cylinders + "" + HornSound;
		return type;

	}

	public String Honks(String Hornsound) {
		HornSound = "Boom!";
		System.out.println(Hornsound);
		return HornSound;
	}

	public static String Honk(String horn) {
		return "Beep beep bep";
	}
}