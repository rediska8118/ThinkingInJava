package ex41;

import generics.SimpleQueue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import typeinfo.pets.Cat;
import typeinfo.pets.Manx;
import typeinfo.pets.Pet;
import typeinfo.pets.Pug;
import net.mindview.util.Generator;

interface Addable<T> {
	void add(T t);
}

class Fill41 {
	// Classtoken version:
	public static <T> void fill(Addable<T> addable,
			Class<? extends T> classToken, int size) {
		for (int i = 0; i < size; i++)
			try {
				addable.add(classToken.newInstance());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
	}

	// Generator version:
	public static <T> void fill(Addable<T> addable, Generator<T> generator,
			int size) {
		for (int i = 0; i < size; i++)
			addable.add(generator.next());
	}
}

// To adapt a base type, you must use composition.
// Make any Collection Addable using composition:
class AddableCollectionAdapter<T> implements Addable<T> {
	private Collection<T> c;

	public AddableCollectionAdapter(Collection<T> c) {
		this.c = c;
	}

	public void add(T item) {
		c.add(item);
	}
}

// A Helper to capture the type automatically:
class Adapter {
	public static <T> Addable<T> collectionAdapter(Collection<T> c) {
		return new AddableCollectionAdapter<T>(c);
	}

}

// To adapt a specific type, you can use inheritance.
// Make a SimpleQueue Addable using inheritance:
class AddableSimpleQueue<T> extends SimpleQueue<T> implements Addable<T> {
	public void add(T item) {
		super.add(item);
	}
}

public class Fill2 {
	public static void main(String[] args) {
		// Adapt a collection:
		List<Pet> pets = new ArrayList<Pet>();
		Fill41.fill(new AddableCollectionAdapter<Pet>(pets), Pet.class, 3);
		// Helper method captures the type:
		Fill41.fill(Adapter.collectionAdapter(pets), Manx.class, 2);
		for (Pet p : pets)
			System.out.print(p);
		System.out.print("---------------");
		// Use an adapted class:
		AddableSimpleQueue<Pet> petQueue = new AddableSimpleQueue<Pet>();
		Fill41.fill(petQueue, Pug.class, 4);
		Fill41.fill(petQueue, Manx.class, 1);
		for (Pet p : petQueue)
			System.out.print(p);
	}
}
