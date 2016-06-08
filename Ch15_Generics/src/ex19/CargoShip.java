package ex19;

import java.util.ArrayList;
import java.util.Random;

import net.mindview.util.Generator;
import ex18.Generators;

class Container {
	private final int id;
	private String description;
	private double price;

	public Container(int IDnumber, String descr, double price) {
		id = IDnumber;
		description = descr;
		this.price = price;
		System.out.println(toString());
	}

	public String toString() {
		return id + ": " + description + ", price: $" + price;
	}

	public void priceChange(double change) {
		price += change;
	}

	public static Generator<Container> generator = new Generator<Container>() {
		private Random rand = new Random(47);

		public Container next() {
			return new Container(rand.nextInt(1000), "Container",
					Math.round(rand.nextDouble() * 1000.0) + 0.99);
		}
	};
}

class Deck extends ArrayList<Container> {
	public Deck(int nContainers) {
		Generators.fill(this, Container.generator, nContainers);
	}
}

class CargoDeck extends ArrayList<Deck> {
	public CargoDeck(int nDecks, int nContainers) {
		for (int i = 0; i < nDecks; i++)
			add(new Deck(nContainers));
	}
}

class Bridge {
}

public class CargoShip extends ArrayList<CargoDeck> {
	private Bridge bridge = new Bridge();

	public CargoShip(int nShips, int nCargoDecks, int nContainers) {
		for (int i = 0; i < nShips; i++)

			add(new CargoDeck(nCargoDecks, nContainers));
	}

	public String toString() {
		StringBuilder result = new StringBuilder();
		for (CargoDeck a : this)
			for (Deck s : a)
				for (Container c : s) {
					result.append(c);
					result.append("\n");
				}
		return result.toString();
	}

	public static void main(String[] args) {
		System.out.println(new CargoShip(14, 5, 10));
	}
}
