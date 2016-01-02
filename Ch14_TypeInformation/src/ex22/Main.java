package ex22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		List<String> strArr = new ArrayList<>(new TextFile(
				"src/ex16/SetOperations.java", "\\W+"));
		System.out.println(strArr);

		Collections.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println(strArr);

		Set<Word> storage = new LinkedHashSet<Word>();

		Iterator<String> iterator = strArr.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			int count = 0;
			for (int i = 0; i < strArr.size(); i++) {
				if (str.equals(strArr.get(i)))
					count++;
			}
			Word word = new Word();
			word.setWord(str);
			word.setCounter(count);
			storage.add(word);
		}

		System.out.println(storage);

	}
}
