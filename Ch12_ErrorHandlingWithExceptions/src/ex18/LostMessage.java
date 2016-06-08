package ex18;

class VeryImportantException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2092065032817473676L;

	public String toString() {
		return "A very important exception!";
	}
}

class HoHumException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2530426703289808348L;

	public String toString() {
		return "A trivial exception";
	}
}

class SomeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9014785493047012298L;

	public String toString() {
		return "Some exception";
	}
}

public class LostMessage {

	void f() throws VeryImportantException {
		throw new VeryImportantException();
	}

	void dispose() throws HoHumException {
		throw new HoHumException();
	}

	public static void main(String[] args) {
		try {
			LostMessage lm = new LostMessage();
			try {
				lm.f();
			} finally {
				try {
					lm.dispose();
				} finally {
					throw new SomeException();
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
