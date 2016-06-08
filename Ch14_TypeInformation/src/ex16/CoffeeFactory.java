package ex16;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import typeinfo.factory.Factory;

public class CoffeeFactory {

	public String toString() {
		return getClass().getSimpleName();
	}

	static List<Factory<? extends Coffee>> coffeeFactories = new ArrayList<Factory<? extends Coffee>>();
	static {
		coffeeFactories.add(new Coffee.Factory());
		coffeeFactories.add(new Breve.Factory());
		coffeeFactories.add(new Cappuccino.Factory());
		coffeeFactories.add(new Americano.Factory());
		coffeeFactories.add(new Latte.Factory());
	}
	private static Random rand = new Random();

	public static Coffee createRandom() {
		int n = rand.nextInt(coffeeFactories.size());
		return coffeeFactories.get(n).create();
	}
}
