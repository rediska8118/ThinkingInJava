package ex07;

public class Main {

	public static void main(String[] args) {
		System.out.println("Before increment: " + StaticTest.i);
		Incrementable.increment();
		System.out.println("After increment: " + StaticTest.i);
	}
}
