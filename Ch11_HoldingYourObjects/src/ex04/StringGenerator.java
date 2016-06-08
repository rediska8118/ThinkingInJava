package ex04;

import java.util.Collection;


public class StringGenerator {

	private static String[] starWarsCharacters = { "Luke Skywalker",
			"Han Solo", "Leia Organa", "R2-D2", "Chewbacca", "Darth Vader",
			"Obi-Wan Kenobi", "Yoda" };

	private int i = 0;

	Object[] fill(Object[] arr) {

		for (int j = 0; j < arr.length; j++) {
			arr[j] = next();
		}
		return arr;
	}

	Collection<String> fill(Collection<String> collection, int size) {
		for (int j = 0; j < size; j++) {
			collection.add(next());
		}

		return collection;
	}

	private String next() {
		if (i == starWarsCharacters.length)
			i = 0;
		i++;
		return starWarsCharacters[i - 1];
	}

}
