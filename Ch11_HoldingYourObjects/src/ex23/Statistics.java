package ex23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {

	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 1; i < 2000; i++) {

			Map<Integer, Integer> generatedMap = generateMap();
			int num = getMaxNumber(generatedMap);
			System.out.println("Map: " + generatedMap + " Max number: " + num);

			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}

		System.out.println("Result Map: " + map + " Max number: "
				+ getMaxNumber(map));
	}

	static int getMaxNumber(Map<Integer, Integer> m) {
		Iterator<Integer> iterator = m.keySet().iterator();
		int maxKey = 0;
		int maxValue = 0;
		while (iterator.hasNext()) {
			int key = iterator.next();
			if (maxValue < m.get(key)) {
				maxValue = m.get(key);
				maxKey = key;
			}
		}
		return maxKey;
	}

	static Map<Integer, Integer> generateMap() {
		Random rand = new Random();
		Map<Integer, Integer> m = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < 10000; i++) {
			// Produce a number between 0 and 20:
			int r = rand.nextInt(20);
			Integer freq = m.get(r);
			m.put(r, freq == null ? 1 : freq + 1);
		}
		return m;
	}
}
