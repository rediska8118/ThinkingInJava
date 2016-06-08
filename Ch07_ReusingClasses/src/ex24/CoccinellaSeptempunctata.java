package ex24;

public class CoccinellaSeptempunctata extends Beetle {

	private int k = printInit("CoccinellaSeptempunctata.c initialized");

	public CoccinellaSeptempunctata() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}

	private static int k2 = printInit("static CoccinellaSeptempunctata.x2 initialized");

	public static void main(String[] args) {
		System.out.println("CoccinellaSeptempunctata constructor");
		CoccinellaSeptempunctata c = new CoccinellaSeptempunctata();
	}
}
