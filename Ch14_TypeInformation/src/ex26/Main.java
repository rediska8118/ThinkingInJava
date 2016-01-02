package ex26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<String, ArrayList<Integer>> map = new LinkedHashMap<>();

		List<String> strArr = new ArrayList<>(new TextFile(
				"src/ex26/SetOperations.java", "\\W+"));
		System.out.println(strArr);

		Iterator<String> it1 = strArr.iterator();
		int count = 0;
		while (it1.hasNext()) {
			String str = it1.next();
			count++;
			if (map.keySet().contains(str)) {
				map.get(str).add(count);
				map.put(str, map.get(str));
			} else {
				ArrayList<Integer> arrList = new ArrayList<>();
				arrList.add(0, count);
				map.put(str, arrList);
			}
		}

		System.out.println(map);

		Iterator<String> it2 = map.keySet().iterator();
		String[] result = new String[strArr.size()];
		while (it2.hasNext()) {
			String str = it2.next();
			for (Integer position : map.get(str)) {
				result[position - 1] = str;
			}
		}

		System.out.println(Arrays.toString(result));

	}
}
