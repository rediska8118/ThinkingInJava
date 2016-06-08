package ex16;

public class Cycle {

	static void ride(ICycleFactory cycleFactory) {
		cycleFactory.getCycle().ride();
	}

	public static void main(String[] args) {
		ride(Bicycle.cycleFactory);
		ride(Tricycle.cycleFactory);
		ride(Unicycle.cycleFactory);
	}
}
