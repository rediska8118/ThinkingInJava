package ex03;

public class TupleTest {

	static SixTuple<String, String, Integer, Object, Object, Object> f() {
		return new SixTuple<String, String, Integer, Object, Object, Object>(
				"A", "B", 123, new Object(), new Object(), new Object());
	}

	public static void main(String[] args) {
		System.out.println(f());
	}
}
