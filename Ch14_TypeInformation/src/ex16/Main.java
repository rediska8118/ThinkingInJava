package ex16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<String> vowels = new HashSet<>(Arrays.asList("A", "E", "I", "O",
				"U", "Y"));

		Set<String> words = new HashSet<String>(new TextFile(
				"src/ex16/SetOperations.java", "\\W+"));
		System.out.println(words);

		int totalNumber = 0;
		for (String word : words) {
			int vowelsCounter = 0;
			for (String character : word.split("(?!^)")) {
				if (vowels.contains(character.toUpperCase())) {
					vowelsCounter++;
				}
			}
			totalNumber += vowelsCounter;
			System.out.println("Vowels: " + vowelsCounter + " " + word);
		}

		System.out.println("Total number of vowels in the input file: "
				+ totalNumber);

	}
}
