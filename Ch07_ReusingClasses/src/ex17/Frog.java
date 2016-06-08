package ex17;

public class Frog extends Amphibian {

	void show() {
		System.out.println("Frog");
	}

	public static void main(String[] args) {
		((Amphibian) new Frog()).show();
	}
}
