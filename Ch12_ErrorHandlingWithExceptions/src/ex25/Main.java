package ex25;

class Exception1 extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5863584515813543401L;

}

class Exception2 extends Exception1 {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6928382471500133203L;

}

class Exception3 extends Exception2 {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1937462694227188631L;

}

public class Main {

	public static void main(String[] args) throws Exception1 {
		A a = (A) new C();
		a.throwAnException();
	}
}
