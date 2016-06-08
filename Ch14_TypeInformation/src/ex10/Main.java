package ex10;

public class Main {

	static char[] arr1 = { 'a', 'b', 'c' };

	public static void main(String[] args) {

		System.out.println(arr1.getClass().getSuperclass());
		System.out.println(arr1 instanceof Object);

	}

}
