package ex08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Gerbil> gerbilList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			gerbilList.add(new Gerbil(i));
		}

		Iterator<Gerbil> iterator = gerbilList.iterator();
		while (iterator.hasNext()) {

			System.out.println(iterator.next().hop());
		}

	}
}
