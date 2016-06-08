package ex04;

import java.util.ArrayList;
import java.util.List;

interface Selector {
	boolean end();

	Object current();

	void next();
}

public class Sequence<T> {
	private List<T> items;

	public Sequence(List<T> items) {
		this.items = items;
	}

	public void add(T x) {
		items.add(x);
	}

	private class SequenceSelector implements Selector {
		private int i = 0;

		public boolean end() {
			return i == items.size();
		}

		public Object current() {
			return items.get(i);
		}

		public void next() {
			if (i < items.size())
				i++;
		}
	}

	public Selector selector() {
		return new SequenceSelector();
	}

	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();

		Sequence<Object> sequence = new Sequence<>(list);
		for (int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
}
