package ex24;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Map<String, Integer> map1 = new LinkedHashMap<>();
		Random random = new Random();

		map1.put("C", random.nextInt(10));
		map1.put("F", random.nextInt(10));
		map1.put("A", random.nextInt(10));
		map1.put("B", random.nextInt(10));
		map1.put("D", random.nextInt(10));
		map1.put("E", random.nextInt(10));

		System.out.println(map1);

		Set<String> set = new TreeSet<String>(map1.keySet());
		System.out.println(set);
		
		Iterator<String> iterator = set.iterator();
		Map<String, Integer> map2 = new LinkedHashMap<>();
		
		while (iterator.hasNext()) {
			String key = iterator.next();

			map2.put(key, map1.get(key));

		}

		System.out.println(map2);

	}
}
