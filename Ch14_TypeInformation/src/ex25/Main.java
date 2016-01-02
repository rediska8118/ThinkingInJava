package ex25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<String, ArrayList<Integer>> map = new LinkedHashMap<>();

		List<String> strArr = new ArrayList<>(new TextFile(
				"src/ex25/SetOperations.java", "\\W+"));
		System.out.println(strArr);

		Iterator<String> iterator = strArr.iterator();
		int count = 0;
		while (iterator.hasNext()) {
			String str = iterator.next();
			count++;
			if (map.keySet().contains(str)) {
				map.get(str).add(count);
				map.put(str, map.get(str));
			} else {
				ArrayList<Integer> arrList = new ArrayList<>();
				arrList.add(0,count);
				map.put(str, arrList);
			}
		}
		
		System.out.println(map);
	}
}
