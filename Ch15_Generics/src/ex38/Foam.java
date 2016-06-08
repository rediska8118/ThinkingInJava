package ex38;

public class Foam extends Decorator {

	private final Boolean withFoam;

	public Foam(Coffee coffee) {
		super(coffee);
		withFoam = true;
	}

	public Boolean get() {
		return withFoam;
	}

}
