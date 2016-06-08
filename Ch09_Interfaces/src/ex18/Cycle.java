package ex18;

public class Cycle {

	static void ride(ICycleFactory cycleFactory) {
		cycleFactory.getCycle().ride();
	}

	public static void main(String[] args) {
		ride(new BicycleFactory());
		ride(new TricycleFactory());
		ride(new UnicycleFactory());
	}
}
