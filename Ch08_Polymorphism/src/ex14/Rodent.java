package ex14;

public class Rodent {
	Rodent() {
		System.out.println("Rodent constructor");
	}

	@Override
	public String toString() {
		return "Rodent";
	}

	protected void dispose() {
		System.out.println("Rodent dispose");
	}
}
