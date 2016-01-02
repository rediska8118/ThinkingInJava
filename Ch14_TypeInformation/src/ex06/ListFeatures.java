package ex06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListFeatures {

	public static void main(String[] args) {
		Random rand = new Random(47);
		List<String> strings = new ArrayList<>();

		strings.add("a");
		strings.add("b");
		strings.add("c");
		strings.add("d");
		strings.add("e");
		strings.add("f");
		System.out.println("1: " + strings);

		String str6 = "6";
		strings.add(str6); // Automatically resizes
		System.out.println("2: " + strings);
		System.out.println("3: " + strings.contains(str6));
		strings.remove(str6); // Remove by object
		String str2 = strings.get(2);
		System.out.println("4: " + str2 + " " + strings.indexOf(str2));
		String str12 = "12";
		System.out.println("5: " + strings.indexOf(str12));
		System.out.println("6: " + strings.remove(str12));
		// Must be the exact object:
		System.out.println("7: " + strings.remove(3));
		System.out.println("8: " + strings);
		strings.add(4, "33"); // Insert at an index

		System.out.println("9: " + strings);
		List<String> sub = strings.subList(1, 4);
		System.out.println("subList: " + sub);
		System.out.println("10: " + strings.containsAll(sub));
		Collections.sort(sub); // In-place sort
		System.out.println("sorted subList: " + sub);
		// Order is not important in containsAll():
		System.out.println("11: " + strings.containsAll(sub));
		Collections.shuffle(sub, rand); // Mix it up
		System.out.println("shuffled subList: " + sub);
		System.out.println("12: " + strings.containsAll(sub));
		List<String> copy = new ArrayList<String>(strings);
		sub = Arrays.asList(strings.get(1), strings.get(4));
		System.out.println("sub: " + sub);
		copy.retainAll(sub);
		System.out.println("13: " + copy);
		copy = new ArrayList<String>(strings); // Get a fresh copy
		copy.remove(2); // Remove by index
		System.out.println("14: " + copy);
		copy.removeAll(sub); // Only removes exact objects
		System.out.println("15: " + copy);
		copy.set(1, "a"); // Replace an element
		System.out.println("16: " + copy);
		copy.addAll(2, sub); // Insert a list in the middle
		System.out.println("17: " + copy);
		System.out.println("18: " + strings.isEmpty());
		strings.clear(); // Remove all elements
		System.out.println("19: " + strings);
		System.out.println("20: " + strings.isEmpty());

		strings.add("30");
		strings.add("31");
		strings.add("32");
		System.out.println("21: " + strings);
		Object[] o = strings.toArray();
		System.out.println("22: " + o[2]);
		String[] pa = strings.toArray(new String[0]);
		System.out.println("23: " + pa[2]);
	}
}
