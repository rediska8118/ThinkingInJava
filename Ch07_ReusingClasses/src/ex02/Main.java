package ex02;

public class Main extends Detergent {

	@Override
	public void scrub() {
		System.out.println("Main.scrub()");
	}

	public void sterilize() {
		System.out.println("Main.sterilize()");
	}

	public static void main(String[] args) {

		Main main = new Main();
		main.scrub();
		main.sterilize();
	}

}
