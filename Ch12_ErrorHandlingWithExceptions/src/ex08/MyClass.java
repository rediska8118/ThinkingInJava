package ex08;

import ex04.MyException;

public class MyClass {

	void throwAnException() throws MyException {
		throw new MyException("Exception Message");
	}
}
