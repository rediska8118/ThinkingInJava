package ex25.pack2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import ex25.pack1.*;

public class Main {

	public static void main(String[] args) throws IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		// Test test = TestMaker.createTest();
		TestImpl test = new TestImpl();

		System.out.println(test.getClass().getName());
		for (Method method : test.getClass().getMethods()) {
			method.setAccessible(true);
			method.invoke(test);
		}

	}
}
