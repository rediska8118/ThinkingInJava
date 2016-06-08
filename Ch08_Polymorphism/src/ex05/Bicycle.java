package ex05;

public class Bicycle extends Cycle {

	private int numberOfWheels = 2;

	void ride() {
		System.out.println("Bicycle.ride()");
	}

	int wheels() {
		return numberOfWheels;
	}
}
