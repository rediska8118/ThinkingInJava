package ex35;

import generics.coffee.Americano;
import generics.coffee.Coffee;
import generics.coffee.Latte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckedList {

	@SuppressWarnings("unchecked")
	static void oldStyleMethod(List probablyAmericanos) {
		probablyAmericanos.add(new Latte());
	}

	public static void main(String[] args) {
		List<Americano> americanos1 = new ArrayList<Americano>();
		oldStyleMethod(americanos1); // Quietly accepts a Latte
		List<Americano> dogs2 = Collections.checkedList(
				new ArrayList<Americano>(), Americano.class);
		try {
			oldStyleMethod(dogs2); // Throws an exception
		} catch (Exception e) {
			System.out.println(e);
		}
		// Derived types work fine:
		List<Coffee> pets = Collections.checkedList(new ArrayList<Coffee>(),
				Coffee.class);
		pets.add(new Americano());
		pets.add(new Latte());
	}
}
