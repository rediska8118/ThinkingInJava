package ex14;

public class Hamster extends Rodent {
	private Characteristic characteristic = new Characteristic("is alive");

	private Shared shared;

	Hamster(Shared shared) {
		System.out.println("Hamster constructor");
		this.shared = shared;
		shared.addRef();
	}

	@Override
	public String toString() {
		return "Hamster";
	}

	protected void dispose() {
		System.out.println("Hamster dispose");
		shared.dispose();
		characteristic.dispose();
		super.dispose();
	}
}
