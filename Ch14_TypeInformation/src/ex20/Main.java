package ex20;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Map<String, Integer> vowels = new HashMap<>();
		vowels.put("A", null);
		vowels.put("E", null);
		vowels.put("I", null);
		vowels.put("O", null);
		vowels.put("U", null);
		vowels.put("Y", null);

		Set<String> words = new HashSet<String>(new TextFile(
				"src/ex16/SetOperations.java", "\\W+"));
		System.out.println(words);

		int totalNumber = 0;
		for (String word : words) {
			int vowelsCounter = 0;
			for (String character : word.split("(?!^)")) {
				String uppCaseChar = character.toUpperCase();
				if (vowels.containsKey(uppCaseChar)) {
					vowels.put(uppCaseChar,	vowels.get(uppCaseChar)==null? 1 : vowels.get(uppCaseChar) + 1);
					vowelsCounter++;
				}
			}
			totalNumber += vowelsCounter;
			System.out.println("Vowels: " + vowelsCounter + " " + word);
		}
		System.out.println(vowels);
		System.out.println("Total number of vowels in the input file: "
				+ totalNumber);
		
		

	}
}
