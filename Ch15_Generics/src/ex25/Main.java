package ex25;

public class Main {

	static <T extends I1> void performI1(T type) {
		System.out.println("I1.perform()");
	}

	static <T extends I2> void performI2(T type) {
		System.out.println("I2.perform()");
	}
	
	public static void main(String[] args) {
		Show show = new Show();
		
		performI1(show);
		performI2(show);
	}
}
