package ex38;

public class SteamedMilk extends Decorator {

	private final Boolean withSteamedMilk;

	public SteamedMilk(Coffee basicCoffee) {
		super(basicCoffee);
		withSteamedMilk = true;
	}


	public Boolean get() {
		return withSteamedMilk;
	}

}
