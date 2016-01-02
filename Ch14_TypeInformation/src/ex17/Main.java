package ex17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<String, Gerbil> map = new HashMap<String, Gerbil>();

		map.put("Fuzzy", new Gerbil(0));
		map.put("Spot", new Gerbil(1));
		map.put("Nutmeg", new Gerbil(2));
		map.put("Funny", new Gerbil(3));

		Iterator<String> it = map.keySet().iterator();

		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key+" "+map.get(key).hop());
		}
	}
}
