package ex04;

public class Main {

	static void downcast(Base base) {
		// ((Derived) base).print();
		base.print();
	}

	public static void main(String[] args) {
		downcast(new Derived());
	}
}
