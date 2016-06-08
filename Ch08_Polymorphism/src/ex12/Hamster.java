package ex12;

public class Hamster extends Rodent {
	private Characteristic characteristic = new Characteristic("is alive");

	Hamster() {
		System.out.println("Hamster constructor");
	}

	@Override
	public String toString() {
		return "Hamster";
	}
	
	protected void dispose() {
		System.out.println("Hamster dispose");
		characteristic.dispose();
		super.dispose();
	}
}
