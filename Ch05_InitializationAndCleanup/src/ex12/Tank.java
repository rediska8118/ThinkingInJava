package ex12;

public class Tank {

	boolean tankIsEmpty = true;

	Tank(boolean tankIsEmpty) {
		this.tankIsEmpty = tankIsEmpty;
	}

	protected void finalize() {
		if (!tankIsEmpty) {
			tankIsEmpty = true;
			System.out.println("Tank is empty: " + tankIsEmpty);
		}
	}

	public static void main(String[] args) {
		new Tank(false);

		System.gc();
	}
}
