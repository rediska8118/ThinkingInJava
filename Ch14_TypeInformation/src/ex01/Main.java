package ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Gerbil> gerbilList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			gerbilList.add(new Gerbil(i));
		}

		for (int i = 0; i < gerbilList.size(); i++) {
			System.out.println(gerbilList.get(i).hop());
		}
	}
}
