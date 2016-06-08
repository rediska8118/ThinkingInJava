package ex06;

public class Chess extends BoardGame {

	Chess() {
		super(11);
		System.out.println("Chess constructor");
	}

	public static void main(String[] args) {
		System.out.println(new Chess());
	}

}
