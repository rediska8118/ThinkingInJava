package ex06;

import java.util.ArrayList;
import java.util.Random;

import typeinfo.pets.Cat;
import typeinfo.pets.Pet;

public class RandomList<T> {
	private ArrayList<T> storage = new ArrayList<T>();
	private Random rand = new Random(47);

	public void add(T item) {
		storage.add(item);
	}

	public T select() {
		return storage.get(rand.nextInt(storage.size()));
	}

	public static void main(String[] args) {
		RandomList<String> rs = new RandomList<String>();
		for (String s : ("The quick brown fox jumped over "
				+ "the lazy brown dog").split(" "))
			rs.add(s);
		for (int i = 0; i < 11; i++)
			System.out.print(rs.select() + " ");

		System.out.println();
		RandomList<Character> rs1 = new RandomList<>();
		for (char s : "Generics".toCharArray())
			rs1.add(s);
		for (int i = 0; i < 11; i++)
			System.out.print(rs1.select() + " ");

		System.out.println();
		RandomList<Pet> rs2 = new RandomList<>();
		for (int i = 0; i < 5; i++)
			rs2.add(new Cat());
		for (int i = 0; i < 5; i++)
			System.out.print(rs2.select() + " ");
	}
}
