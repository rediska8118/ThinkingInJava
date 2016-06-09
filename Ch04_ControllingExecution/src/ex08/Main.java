package ex08;

public class Main {

	public static void main(String[] args) {

		for (int i = 5; i >= 0; i--) {
			switch (i) {
			case 0:
				System.out.println("msg0");
				//break;
			case 1:
				System.out.println("msg1");
				//break;
			case 2:
				System.out.println("msg2");
				break;
			case 3:
				System.out.println("msg3");
				break;
			default:
				System.out.println("default msg");
			}
		}
	}
}
