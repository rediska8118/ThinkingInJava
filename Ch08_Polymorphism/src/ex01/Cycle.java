package ex01;

public class Cycle {

	void ride() {
		System.out.println("Cycle.ride()");
	}

	static void startJourney(Cycle cycle) {
		cycle.ride();
	}

	public static void main(String[] args) {

		startJourney(new Cycle());
		startJourney(new Unicycle());
		startJourney(new Bicycle());
		startJourney(new Tricycle());
	}
}
