package ex12;

public class Gerbil extends Rodent {
	private Characteristic characteristic = new Characteristic("is alive");

	Gerbil() {
		System.out.println("Gerbil constructor");
	}

	@Override
	public String toString() {
		return "Gerbil";
	}
	
	protected void dispose() {
		System.out.println("Gerbil dispose");
		characteristic.dispose();
		super.dispose();
	}
}
