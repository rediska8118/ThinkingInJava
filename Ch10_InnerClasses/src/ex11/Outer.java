package ex11;

public class Outer {

	Interface getInner() {
		return new Inner();
	}

	private class Inner implements Interface {

		@Override
		public void doBest() {
			System.out.println("Inner.doBest()");

		}
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		((Inner) outer.getInner()).doBest();
	}
}
