package ex23;

interface FactoryI<T> {
	T create(Object obj);
}

class Foo2<T> {
	private T x;

	public <F extends FactoryI<T>> Foo2(F factory) {
		x = factory.create(new Object());
	}
	
	void showX(){
		System.out.println(x);
	}
	// ...
}

class IntegerFactory implements FactoryI<Integer> {
	public Integer create(Object obj) {
		return new Integer(0);
	}
}

class Widget {
	public static class Factory implements FactoryI<Widget> {
		public Widget create(Object obj) {
			return new Widget();
		}
	}
}

public class FactoryConstraint {
	public static void main(String[] args) {
		new Foo2<Integer>(new IntegerFactory()).showX();
		new Foo2<Widget>(new Widget.Factory()).showX();;
	}
}
