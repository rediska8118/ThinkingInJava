package ex07;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Tester[] testers = new Tester[10];

		for (int i = 0; i < testers.length; i++) {
			testers[i] = new Tester();
		}

		List<Tester> lt = new ArrayList<Tester>();

		for (Tester tr : testers) {
			lt.add(tr);
		}

		System.out.println("List of Tester:" + lt);

		List<Tester> sub = lt.subList(2, 6);
		System.out.println("SubList: " + sub);
		
		lt.removeAll(sub);
		System.out.println(lt);
	}
}
