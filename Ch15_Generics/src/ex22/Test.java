package ex22;

class Temp {
}

public class Test {

	Class<?> kind;

	public Test(Class<?> kind) {
		this.kind = kind;
	}

	public Object createNew(String typename) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException {
		return Class.forName(typename).newInstance();
	}

	public Object createNew(String typename, Object param)
			throws NoSuchMethodException, SecurityException,
			ClassNotFoundException {
		return Class.forName(typename).getConstructor(param.getClass());
	}

	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException,
			NoSuchMethodException, SecurityException {
		Test test = new Test(String.class);

		System.out.println(test.createNew("ex22.Temp"));
		System.out.println(test.createNew("ex22.Test", new Integer(1).getClass()));
	}

}
