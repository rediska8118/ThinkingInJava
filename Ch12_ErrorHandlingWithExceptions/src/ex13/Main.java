package ex13;

import java.util.Random;

public class Main {

	static void throwAnException() throws MyException1, MyException2,
			MyException3 {

		Random random = new Random();

		switch (random.nextInt(5)) {
		case 0:
			throw new MyException1();
		case 1:
			throw new MyException2();
		case 2:
			throw new MyException3();
		default:
			throw new NullPointerException();
		}

	}

	static int counter = 0;

	public static void main(String[] args) {

		while (true) {
			try {
				throwAnException();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			} finally {
				counter++;
				System.err.println("In finally");
				if (counter == 5)
					break;
			}
		}
	}
}
