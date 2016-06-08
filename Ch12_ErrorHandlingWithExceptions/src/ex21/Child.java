package ex21;

public class Child extends Parent {

	public Child() throws MyException {

		try {
			//super();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws MyException {

		new Child();
	}
}
