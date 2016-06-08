package ex38;

public class WhippedCream extends Decorator {

	private final Boolean withWhippedCream;

	public WhippedCream(Coffee coffee) {
		super(coffee);
		withWhippedCream = true;
	}

	public Boolean get() {
		return withWhippedCream;
	}
}
