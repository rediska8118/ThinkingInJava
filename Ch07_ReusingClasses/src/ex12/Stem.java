package ex12;

public class Stem extends Root {
	public Stem() {
		System.out.println("Stem constructor");
	}

	void dispose() {
		System.out.println("Stem.dispose()");
		super.dispose();
	}

	public static void main(String[] args) {
		Stem stem = null;
		try {
			System.out.println("Inside try");
			stem = new Stem();
		} catch (Exception e) {
			System.out.println("Inside catch");

		} finally {
			System.out.println("Inside finally");
			stem.dispose();
		}
	}
}
