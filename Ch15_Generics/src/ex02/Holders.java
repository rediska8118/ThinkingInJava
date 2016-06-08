package ex02;

public class Holders<T> {

	private T a, b, c;

	public Holders(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public T getB() {
		return b;
	}

	public void setB(T b) {
		this.b = b;
	}

	public T getC() {
		return c;
	}

	public void setC(T c) {
		this.c = c;
	}

	public String toString() {
		return a.getClass().getName() + " = " + a + "; "
				+ b.getClass().getName() + " = " + b + "; "
				+ c.getClass().getName() + " = " + c;
	}

	public static void main(String[] args) {
		Tree tree1 = new Tree("Oak");
		Tree tree2 = new Tree("Cherry");
		Tree tree3 = new Tree("Elm");

		Holders<Tree> holders = new Holders<Tree>(tree1, tree2, tree3);
		System.out.println(holders);
	}
}
