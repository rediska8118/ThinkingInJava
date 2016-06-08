package ex05;

public class Unicycle extends Cycle{

	private int numberOfWheels = 10;
	
	void ride(){
		System.out.println("Unicycle.ride()");
	}
	
	int wheels() {
		return numberOfWheels;
	}
}
