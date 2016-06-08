package ex38;

public class Decorator extends Coffee {

	protected Coffee coffee;

	public Decorator(Coffee basicCoffee) {
		this.coffee = basicCoffee;
	}

	public void set(Boolean value) {
		coffee.set(value);
	}

	public Boolean get() {
		return coffee.get();
	}

}
