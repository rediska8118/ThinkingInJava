package ex14;

public class Derived extends Base implements Interface {

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("Derived.method()");
	}

	@Override
	public void method11() {
		// TODO Auto-generated method stub
		System.out.println("Derived.method11()");
	}

	@Override
	public void method12() {
		// TODO Auto-generated method stub
		System.out.println("Derived.method12()");
	}

	@Override
	public void method21() {
		// TODO Auto-generated method stub
		System.out.println("Derived.method21()");
	}

	@Override
	public void method22() {
		// TODO Auto-generated method stub
		System.out.println("Derived.method22()");
	}

	@Override
	public void method31() {
		// TODO Auto-generated method stub
		System.out.println("Derived.method31()");
	}

	@Override
	public void method32() {
		// TODO Auto-generated method stub
		System.out.println("Derived.method32()");
	}

	void method1(Interface i) {
		i.method();
		i.method11();
		i.method12();
		i.method21();
		i.method21();
		i.method31();
		i.method32();
	}

	void method2(Interface1 i1) {
		i1.method11();
		i1.method12();
	}

	void method3(Interface2 i2) {
		i2.method21();
		i2.method22();
	}

	void method4(Interface3 i3) {
		i3.method31();
		i3.method32();
	}

	public static void main(String[] args) {
		Derived derived = new Derived();

		derived.method1(new Derived());
		System.out.println("========");
		derived.method2(new Derived());
		System.out.println("========");
		derived.method3(new Derived());
		System.out.println("========");
		derived.method4(new Derived());
	}

}
