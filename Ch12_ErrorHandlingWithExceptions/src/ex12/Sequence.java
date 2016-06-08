package ex12;

interface Selector {
	boolean end();

	Object current();

	void next();
}

public class Sequence {

	private Object[] items;
	private int next = 0;

	public Sequence(int size) {
		items = new Object[size];
	}

	public void add(Object x) throws MyOutOfBoundException {
		if (next < items.length)
			items[next++] = x;
		else throw new MyOutOfBoundException("MyOutOfBoundException. Required only " + items.length +" elements");
	}

	private class SequenceSelector implements Selector {
		private int i = 0;

		public boolean end() {
			return i == items.length;
		}

		public Object current() {
			return items[i];
		}

		public void next() {
			if (i < items.length)
				i++;
		}
	}

	public Selector selector() {
		return new SequenceSelector();
	}

	public static void main(String[] args) throws MyOutOfBoundException {
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 12; i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
}
