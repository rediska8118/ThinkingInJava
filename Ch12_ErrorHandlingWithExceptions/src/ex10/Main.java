package ex10;

public class Main {
	static void f() throws MyException2{
		try {
			g();
		} catch (MyException1 e) {
			// TODO Auto-generated catch block
			throw new MyException2();
		}
	}
	static void g() throws MyException1 {
		throw new MyException1();
	}
	
	public static void main(String[] args) throws MyException2 {
		f();
	}

}
