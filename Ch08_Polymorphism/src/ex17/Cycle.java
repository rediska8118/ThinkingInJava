package ex17;

public class Cycle {

	void ride() {
		System.out.println("Cycle.ride()");
	}

	static void startJourney(Cycle cycle) {
		cycle.ride();
	}

	public static void main(String[] args) {
		
		Cycle[] cycles = {new Tricycle(),new Bicycle(),new Unicycle()};
		for (Cycle cycle: cycles){
			startJourney(cycle);
			//cycle.balance();
		}
		
	}
}
