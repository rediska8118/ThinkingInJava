package ex12;

import generics.coffee.Coffee;
import generics.coffee.CoffeeGenerator;
import net.mindview.util.TypeCounter;

public class Main {

	public static void main(String[] args) {
		TypeCounter counter = new TypeCounter(Coffee.class);
		for(Coffee coffee : new CoffeeGenerator(20)) {
			System.out.println(coffee.getClass().getSimpleName() + " ");
			counter.count(coffee);
		}
		System.out.println();
		System.out.println(counter);
	}
}
