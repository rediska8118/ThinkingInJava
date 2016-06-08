package ex01;

public class Main {
	private ClassA classA;

	Main() {
		System.out.println("Main constructor");
	}

	public String toString() {
		if (classA == null)
			classA = new ClassA();
		return "ClassA = " + classA;
	}

	public static void main(String[] args) {
		Main main = new Main();
		System.out.println(main);
	}
}
