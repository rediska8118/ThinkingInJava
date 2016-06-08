package ex02;

public class Main {

	String str = "default";

	public Main() {

	}

	Main(String str) {
		this.str = str;
	}

	public static void main(String[] args) {

		System.out.println(new Main().str);
		System.out.println(new Main("init").str);
	}
}
