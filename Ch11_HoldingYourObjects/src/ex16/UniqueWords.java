package ex16;

import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {

	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>(new TextFile(
				"src/ex16/SetOperations.java", "\\W+"));
		System.out.println(words);
	}
}
