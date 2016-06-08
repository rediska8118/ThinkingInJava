package ex01;

public class ClassA {
	private String str;

	public ClassA() {
		System.out.println("ClassA Constructor");
		str = "Lazy Init";
	}

	public String toString() {
		return str;
	}
}
