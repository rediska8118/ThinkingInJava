package ex12;

public class Mouse extends Rodent {
	private Characteristic characteristic = new Characteristic("is alive");

	Mouse() {
		System.out.println("Mouse constructor");
	}

	@Override
	public String toString() {
		return "Mouse";
	}
	
	protected void dispose() {
		System.out.println("Mouse dispose");
		characteristic.dispose();
		super.dispose();
	}
}
