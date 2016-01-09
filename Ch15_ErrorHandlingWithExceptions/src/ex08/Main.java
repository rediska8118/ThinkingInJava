package ex08;

import ex04.MyException;

public class Main {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		try {
			myClass.throwAnException();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}
}
