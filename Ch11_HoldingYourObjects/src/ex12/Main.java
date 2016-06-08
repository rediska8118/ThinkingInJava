package ex12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {

		List<Integer> firstList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
		List<Integer> secondList = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9));
		System.out.print("2nd list before: " + secondList);
		
		ListIterator<Integer> firstIterator = firstList.listIterator();
		ListIterator<Integer> secondIterator = secondList.listIterator();

		while (firstIterator.hasNext()) {
			firstIterator.next();
		}

		while (secondIterator.hasNext()) {
			secondIterator.next();
			secondIterator.set(firstIterator.previous());
		}
		System.out.print(" 2nd list after: " + secondList);

	}
}
