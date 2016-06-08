package ex06;

public class Main {

	public static void main(String[] args) {
		try {
			throw new MyException1();
		} catch (MyException1 e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.err.println("First Exception");
		}
		try {
			throw new MyException2();
		} catch (MyException2 e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.err.println("Second Exception");
		}

	}
}
