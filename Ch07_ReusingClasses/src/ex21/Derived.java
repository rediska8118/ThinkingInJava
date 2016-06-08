package ex21;

public class Derived extends Base {
	@Override
	void show() {
		System.out.println("Derived");
	}

	public static void main(String[] args) {
		Derived derived = new Derived();
		derived.show();
	}
}
