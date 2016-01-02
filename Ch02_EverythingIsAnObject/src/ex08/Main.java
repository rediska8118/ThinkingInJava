package ex08;

public class Main {
	
	public static void main(String[] args) {
		for (int j = 0; j < 10; j++) {
			StaticStorage ss = new StaticStorage();
			ss.i++;
			System.out.println("Number of objects: " + j + " Value of static variable: "
					+ StaticStorage.i);
		}
	}
}
