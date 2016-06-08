package ex03;

public class Derived extends Base {

	private int i = 11;

	@Override
	protected void print() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		Derived derived = new Derived();
		derived.print();
	}

}
