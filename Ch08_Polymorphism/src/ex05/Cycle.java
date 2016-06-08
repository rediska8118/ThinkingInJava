package ex05;

public class Cycle {

	private int numberOfWheels = 1;

	void ride() {
		System.out.println("Cycle.ride()");
	}

	int wheels() {
		return numberOfWheels;
	}

	static void startJourney(Cycle cycle) {
		cycle.ride();
		System.out.println("Number of wheels: " + cycle.wheels());
	}

	public static void main(String[] args) {

		startJourney(new Cycle());
		startJourney(new Unicycle());
		startJourney(new Bicycle());
		startJourney(new Tricycle());
	}
}
