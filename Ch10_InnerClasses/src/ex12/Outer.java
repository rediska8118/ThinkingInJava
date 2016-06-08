package ex12;

interface Inner {
	void modify();
}

public class Outer {

	private String str = "outer";

	private void doBest() {
		System.out.println("Outer.doBest()");
	}

	public Inner doTheNeedFull() {
		System.out.println("Outer.doTheNeedFull()");
		return new Inner() {
			public void modify() {
				str = "inner";
				System.out.println("Modify string: " + str);
				doBest();
			}
		};
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.doTheNeedFull().modify();
	}

}
