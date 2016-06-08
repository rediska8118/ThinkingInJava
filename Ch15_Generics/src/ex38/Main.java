package ex38;

public class Main {

	public static void main(String[] args) {
		SteamedMilk sm = new SteamedMilk(new Coffee());
		SteamedMilk sm2 = new SteamedMilk(new Foam(new Coffee()));
		Chocolate c = new Chocolate(new Coffee());
		WhippedCream wc = new WhippedCream(new Caramel(new Chocolate(new Foam(
				new SteamedMilk(new Coffee())))));
	}
}
