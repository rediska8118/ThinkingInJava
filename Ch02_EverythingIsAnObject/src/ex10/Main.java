package ex10;

public class Main {

	public static void main(String[] args) {
		if (args.length >= 3) {
			for (int i = 0; i < 3; i++) {
				System.out.println(args[i]);
			}
		} else {
			System.out.println("Add more args");
		}

	}
}
