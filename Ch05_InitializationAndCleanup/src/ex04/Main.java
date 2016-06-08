package ex04;

public class Main {

	public Main() {
		System.out.println("Message in the bottle");
	}

	public Main(String str) {
		System.out.println(str + " Message in the bottle");
	}

	public static void main(String[] args) {
		new Main();
		new Main("SOS");
	}
}
