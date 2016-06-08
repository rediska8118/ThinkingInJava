package ex21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		List<String> textFile = new ArrayList<>(new TextFile(
				"src/ex16/SetOperations.java", "\\W+"));
		System.out.println(textFile);

		Collections.sort(textFile, String.CASE_INSENSITIVE_ORDER);
		
		Map<String, Integer> words = new LinkedHashMap<String, Integer>();

		for (String str : textFile) {
			words.put(str, words.get(str) == null ? 1 : words.get(str) + 1);
		}
		System.out.println(words);

	}
}
