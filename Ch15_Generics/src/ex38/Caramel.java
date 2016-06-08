package ex38;

public class Caramel extends Decorator {

	private final Boolean withCaramel;

	public Caramel(Coffee coffee) {
		super(coffee);
		withCaramel = true;
	}

	public Boolean get() {
		return withCaramel;
	}
}
