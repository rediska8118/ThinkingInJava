package ex08;

class GrandPa {

}

class Pa extends GrandPa {

}

class Child extends Pa {

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
			
			try {
				printRecursive(obj.getClass().getSuperclass().newInstance());
			} catch (InstantiationException | IllegalAccessException e) {
				
				e.printStackTrace();
			}
		} else {
			System.out.println(obj.getClass().getName());
		}
	}
}
