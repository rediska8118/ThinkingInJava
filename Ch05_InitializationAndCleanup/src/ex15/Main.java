package ex15;

public class Main {

	String str;
	{
		str = "default";
		System.out.println(str);
	}

	public Main() {
		System.out.println("Main constructor");
	}

	public static void main(String[] args) {

		new Main();
	}
}
