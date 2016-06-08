package ex09;

import java.lang.reflect.Field;

class GrandPa {

	private int grandPaAge = 100;
	private String grandPaName = "Dmitriy";
}

class Pa extends GrandPa {

	private int paAge = 65;
	private String paName = "Sergey";
}

class Child extends Pa {

	private int childAge = 30;
	private String childName = "Alena";
}

public class Main {

	public static void main(String[] args) {

		printRecursive(new Child());
		System.out.println();
		printRecursive(new Pa());
	}

	static void printRecursive(Object obj) {
		if (obj.getClass().getSuperclass() != null) {
			System.out.println(obj.getClass().getName());
			for (Field field : obj.getClass().getDeclaredFields()) {
				System.out.println(field);
			}

			try {
				printRecursive(obj.getClass().getSuperclass().newInstance());
			} catch (InstantiationException | IllegalAccessException e) {

				e.printStackTrace();
			}
		} else {
			System.out.println(obj.getClass().getName());
			for (Field field : obj.getClass().getDeclaredFields()) {
				System.out.println(field);
			}
		}
	}
}
