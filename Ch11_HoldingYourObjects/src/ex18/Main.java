package ex18;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("five", 5);
		hashMap.put("three", 3);
		hashMap.put("one", 1);
		hashMap.put("four", 4);
		hashMap.put("two", 2);

		System.out.println(hashMap);

		SortedSet<String> keys = new TreeSet<String>(hashMap.keySet());
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		for (String key : keys) {
			linkedHashMap.put(key, hashMap.get(key));
		}
		System.out.println(linkedHashMap);

	}
}
