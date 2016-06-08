package ex23;

public class B {

	private U[] arr;
	private int counter = 0;

	public B(int i) {
		this.arr = new U[i];
	}

	void add(U u) {
		arr[counter] = u;
		counter++;
	}

	void remove(int i) {
		arr[i] = null;
	}

	void call() {
		for (U u : arr) {
			if (u == null)
				continue;
			u.method1();
			u.method2();
			u.method3();
		}
	}
}
