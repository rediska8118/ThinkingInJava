package ex28;

public class MyException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8045629304537480194L;
	private String message = "";

	public MyException(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}

	String getString() {
		return message;
	}

	public static void main(String[] args) {
		try {
			throw new MyException("My Exception Handler");
		} catch (MyException e) {
			System.out.println(e.getString());
		}
	}
}
