package ex10;

public class GenericMethods {

	public <Y, X> void f(Object obj, Y y, X x) {
		System.out.println(obj.getClass().getName());
		System.out.println(y.getClass().getName());
		System.out.println(x.getClass().getName());
	}

	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		gm.f("", 1, 1.0);
		gm.f(1.0F, 'c', gm);
	}
}
