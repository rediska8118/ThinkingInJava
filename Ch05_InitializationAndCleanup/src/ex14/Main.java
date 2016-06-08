package ex14;

public class Main {

	static String str1 = "default";

	static String str2;
	static {
		str2 = "block";
	}

	Main() {
		showStrings();
	}

	static void showStrings() {
		System.out.println(str1);
		System.out.println(str2);
	}

	public static void main(String[] args) {
		new Main();
	}
}
