package ex07;

public class C extends A {
	public C() {
		super(4);
		System.out.println("C constructor");
	}

	private B b = new B(5);

	public static void main(String[] args) {
		System.out.println(new C());
	}
}
