package ex19;

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
			} catch (Exception e) {
				System.out.println(e);
			} finally {
				lm.dispose();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
