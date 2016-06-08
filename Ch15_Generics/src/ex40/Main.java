package ex40;

import java.lang.reflect.*;
import java.util.*;
import static net.mindview.util.Print.*;
import typeinfo.pets.*;

class Test {

	public static <T, S extends Iterable<? extends T>> void apply(S seq,
			Method f, Object... args) {
		try {
			for (T t : seq)
				f.invoke(t, args);
		} catch (Exception e) {
			// Failures are programmer errors
			throw new RuntimeException(e);
		}
	}
}

class FilledList<T> extends ArrayList<T> {
	public FilledList(Class<? extends T> type, int size) {
		try {
			for (int i = 0; i < size; i++)
				// Assumes default constructor:
				add(type.newInstance());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

public class Main {
	public static void main(String[] args) throws Exception {
		// Random list of 10 pets:
		List<Pet> pets = Pets.arrayList(10);
		System.out.println("Random pets: " + pets);
		// Applies the overridden methods:
		Test.apply(pets, Pet.class.getMethod("speak"));
		// FilledList contains only one type:
		Test.apply(new FilledList<Pet>(Dog.class, 5),
				Pet.class.getMethod("speak"));
	}
}