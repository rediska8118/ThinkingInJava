package ex38;

public class Chocolate extends Decorator {

	private final Boolean withChocolate;

	public Chocolate(Coffee coffee) {
		super(coffee);
		withChocolate = true;
	}

	public Boolean get() {
		return withChocolate;
	}
}
