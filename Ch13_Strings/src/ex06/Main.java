package ex06;

public class Main {

	private int i = 123;
	private long l = 123123;
	private float f = 123.123f;
	private double d = 123.123f;

	public String toString() {
		return String.format("(num1=%d, num2=%d, num3=%.16f, num4=%.16g)", i, l, f, d);
	}

	public static void main(String[] args) {
		Main main = new Main();
		System.out.println(main.toString());
	}
}
