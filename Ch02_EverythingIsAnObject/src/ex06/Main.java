package ex06;

public class Main {

	static int storage(String s) {
		return s.length() * 2;
	}

	public static void main(String[] args) {
		System.out.println("Strorage size: " + storage("abc"));
	}
}
