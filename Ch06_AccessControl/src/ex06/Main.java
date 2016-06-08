package ex06;

class Test {
	protected String str = "test";
}

class Change {
	static void change(Test test, String str) {
		test.str = str;
	}
}

public class Main {

	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.str);
		Change.change(test, "new");
		System.out.println(test.str);
	}
}
