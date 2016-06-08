package ex09;

import ex08.Splitting;

public class Main {

	public static void main(String[] args) {
		System.out.println(Splitting.knights.replaceAll(
				"[aeiou]", "_"));
	}
}
