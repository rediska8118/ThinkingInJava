package ex30;

import java.util.Random;

class Annoyance extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4832554859527012405L;
}

class Sneeze extends Annoyance {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9078368321770723999L;
}

public class Human {

	public static void main(String[] args) {
		// Catch the exact type:

		WrapCheckedException wrapCheckedException = new WrapCheckedException();
		Random random = new Random();
		try {
			wrapCheckedException.throwRuntimeException(random.nextInt(4));
		} catch (Sneeze s) {
			System.out.println("Caught Sneeze");
		} catch (Annoyance a) {
			System.out.println("Caught Annoyance");
		} catch (RuntimeException r) {
			System.out.println("Runtime Exception");
			try {
				throw r.getCause();
			} catch (Sneeze s) {
				System.out.println("Caught Sneeze");
			} catch (Annoyance a) {
				System.out.println("Caught Annoyance");
			} catch (Throwable t) {
				System.out.println("Throwable");
			}
		}

	}
}
