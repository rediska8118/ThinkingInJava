package ex07;

import java.util.Iterator;

import net.mindview.util.Generator;

public class IterableFibonacci implements Iterable<Integer>, Generator<Integer> {

	private int n;
	private int count = 0;

	public IterableFibonacci(int n) {
		this.n = n;
	}

	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			public boolean hasNext() {
				return n > 0;
			}

			public Integer next() {
				n--;
				return IterableFibonacci.this.next();
			}

			public void remove() { // Not implemented
				throw new UnsupportedOperationException();
			}
		};
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return fib(count++);
	}

	private int fib(int n) {
		if (n < 2)
			return 1;
		return fib(n - 2) + fib(n - 1);
	}

	public static void main(String[] args) {
		for (int i : new IterableFibonacci(18))
			System.out.print(i + " ");
	}

}
