package ex13;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import generics.Fibonacci;
import generics.coffee.*;
import net.mindview.util.Generator;

public class Generators {

	public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen,
			int n) {
		for (int i = 0; i < n; i++)
			coll.add(gen.next());
		return coll;
	}

	public static <T> List<T> fill(List<T> coll, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++)
			coll.add(gen.next());
		return coll;
	}

	public static <T> Set<T> fill(Set<T> coll, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++)
			coll.add(gen.next());
		return coll;
	}

	public static <T> Queue<T> fill(Queue<T> coll, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++)
			coll.add(gen.next());
		return coll;
	}

	public static <T> LinkedList<T> fill(LinkedList<T> coll, Generator<T> gen,
			int n) {
		for (int i = 0; i < n; i++)
			coll.add(gen.next());
		return coll;
	}

	public static void main(String[] args) {
		List<Coffee> coffeeList = fill(new ArrayList<Coffee>(),
				new CoffeeGenerator(), 5);
		System.out.println("List type: " + coffeeList.getClass());
		System.out.println("coffeeList:" + coffeeList);
		Queue<Coffee> coffeeQueue = fill(new ArrayDeque<Coffee>(),
				new CoffeeGenerator(), 5);
		System.out.println("Queue type: " + coffeeQueue.getClass());
		System.out.println("coffeeQueue: " + coffeeQueue);
		Set<Coffee> coffeeSet = fill(new LinkedHashSet<Coffee>(),
				new CoffeeGenerator(), 5);
		System.out.println("Set type: " + coffeeSet.getClass());
		System.out.println("coffeeSet: " + coffeeSet);
		LinkedList<Coffee> coffeeLinkedList = fill(new LinkedList<Coffee>(),
				new CoffeeGenerator(), 5);
		System.out.println("LinkedList type: " + coffeeLinkedList.getClass());
		System.out.println("coffeeLinkedList: " + coffeeLinkedList);
	}
}
