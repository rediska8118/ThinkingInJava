package ex14;

public class Gerbil extends Rodent {
	private Characteristic characteristic = new Characteristic("is alive");

	private static Shared shared;

	Gerbil(Shared shared) {
		System.out.println("Gerbil constructor");
		this.shared = shared;
		shared.addRef();
	}

	@Override
	public String toString() {
		return "Gerbil";
	}

	protected void dispose() {
		System.out.println("Gerbil dispose");
		shared.dispose();
		characteristic.dispose();
		super.dispose();
	}
}
