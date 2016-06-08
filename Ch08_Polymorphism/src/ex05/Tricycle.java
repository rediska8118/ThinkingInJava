package ex05;

public class Tricycle extends Cycle {

	private int numberOfWheels = 3;

	void ride() {
		System.out.println("Tricycle.ride()");
	}

	int wheels() {
		return numberOfWheels;
	}
}
