package ex09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sequence {
	private List<Object> items;	

	public Sequence(int i) {
		items = new ArrayList<>(i);
	}

	public void add(Object x) {
		items.add(x);
	}
	
	public Iterator<Object> getIterator(){
		return items.iterator();
	}

	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		Iterator<Object> iter = sequence.getIterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
	}
}
