package ex14;

public class Mouse extends Rodent {
	private Characteristic characteristic = new Characteristic("is alive");

	private Shared shared;

	Mouse(Shared shared) {
		System.out.println("Mouse constructor");
		this.shared = shared;
		shared.addRef();
	}

	@Override
	public String toString() {
		return "Mouse";
	}

	protected void dispose() {
		System.out.println("Mouse dispose");
		shared.dispose();
		characteristic.dispose();
		super.dispose();
	}
}
