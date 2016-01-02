package ex05;

public class Main {

	public static void main(String[] args) {
		DataOnly dataOnly = new DataOnly();
		dataOnly.i = 47;
		dataOnly.d = 1.1;
		dataOnly.b = false;
		System.out.println(dataOnly.toString());
	}
}
