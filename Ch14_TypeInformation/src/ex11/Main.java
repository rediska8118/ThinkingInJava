package ex11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Main {

	static void printObjects(Collection<Object> collection) {
		Iterator<Object> iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next().toString() + " ");
		}
	}

	static Collection<Object> fillContainer(Collection<Object> collection) {
		collection.add("123");
		collection.add(new String("123str"));
		collection.add(new Hamster());
		collection.add(new Mouse());
		collection.add(new Hamster());
		collection.add(new Mouse());

		return collection;
	}

	public static void main(String[] args) {
		System.out.println("ArrayList");
		printObjects(fillContainer(new ArrayList<>()));
		System.out.println("LinkedList");
		printObjects(fillContainer(new LinkedList<>()));
		System.out.println("HashSet");
		printObjects(fillContainer(new HashSet<>()));
		System.out.println("LinkedHashSet");
		printObjects(fillContainer(new LinkedHashSet<>()));

	}
}
