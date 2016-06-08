package ex11;

public class Main {
	static void f() throws MyException2 {
		try{
		g();
		} catch(MyException2 e){
			throw new RuntimeException(e);
		}

	}

	static void g() throws MyException2 {
		throw new MyException2();
	}

	public static void main(String[] args) throws MyException2 {
		f();
	}

}
