package ex16;

public class RegisteredCoffeeFactories {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			System.out.println(CoffeeFactory.createRandom());
	}
}
