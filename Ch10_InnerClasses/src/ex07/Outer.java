package ex07;

public class Outer {

	private String str = "outer";

	private void doBest() {
		System.out.println("Outer.doBest()");
	}

	void doTheNeedFull() {
		System.out.println("Outer.doTheNeedFull()");
		new Inner().modify();
	}

	class Inner {

		void modify() {
			str = "inner";
			System.out.println("Modify string: " + str);
			doBest();
		}
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.doTheNeedFull();
	}

}
