package ex27;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<? extends Number> numbers  = new ArrayList<Integer>();
		
		numbers.add(null); // legal but uninteresting
		//numbers.add(new Integer(1));
		Number number = numbers.get(0);
		System.out.println(number);
	}
}
