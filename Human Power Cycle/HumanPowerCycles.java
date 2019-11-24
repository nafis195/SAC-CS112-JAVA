public interface HumanPoweCycle {
	// Member of instance variables
	int NumberofWheels = 0;
	int NumberofGears = 0;
	String name = "";
	String color = "";
	int CurrentGear = 0;

	// Getting the current speed and returning the Number of Gears
	public static int GetCurrentSpeed() {
		return NumberofGears + 5;
	}

	public static int getNumberofWheels() {
		return NumberofWheels;
	}

	public static int getNumberofGears() {
		return NumberofGears;
	}

	public static int getCurrentGear() {
		return CurrentGear;
	}
}

















public class Unicycle implements HumanPoweCycle {
	// Member of instance variables
	int NumberofWheels = 1;
	int NumberofGears = 3;
	int CurrentGear = 0;

	// Getting current speed and returning speed of the current gear
	public int GetCurrentSpeed() {
		if (CurrentGear == 1) {
			return 5;
		} else if (CurrentGear == 2) {
			return 6;
		} else {
			return 8;
		}

	}

	public void SetCurrentGear(int num) {
		CurrentGear = num;
	}
}















public class Bicycle implements HumanPoweCycle {
	// Member of instance variables
	int NumberofWheels = 2;
	int NumberofGear = 5;
	int CurrentGear = 0;

	// Getting current speed and returning speed of the current gear
	public int GetCurrentSpeed() {
		if (CurrentGear == 1) {
			return 6;
		} else if (CurrentGear == 2) {
			return 7;
		} else if (CurrentGear == 3) {
			return 8;
		} else if (CurrentGear == 4) {
			return 9;
		} else {
			return 10;
		}

	}

	public void SetCurrentGears(int num) {
		CurrentGear = num;
	}
}



















public class Tricycle implements HumanPoweCycle {
	// Member of instance variables
	int NumberofWheels = 3;
	int NumberofGear = 5;
	int currentGear = 0;

	// Getting current speed and returning speed of the current gear

	public int GetCurrentSpeed() {
		if (CurrentGear == 1) {
			return 6;
		} else if (CurrentGear == 2) {
			return 7;

		} else if (CurrentGear == 3) {
			return 8;
		} else if (CurrentGear == 4) {
			return 9;
		} else {
			return 10;
		}
	}

	public void SetCurrentGears(int num) {
		currentGear = num;
	}
}