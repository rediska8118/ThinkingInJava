package ex19;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("five");
		hashSet.add("three");
		hashSet.add("one");
		hashSet.add("four");
		hashSet.add("two");

		System.out.println(hashSet);

		SortedSet<String> keys = new TreeSet<String>(hashSet);
		Set<String> linkedHashSet = new LinkedHashSet<>();
		for (String key : keys) {
			linkedHashSet.add(key);
		}
		System.out.println(linkedHashSet);
	}
}
