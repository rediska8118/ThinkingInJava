package ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(new StringGenerator().fill(new String[12])));
		System.out.println(new StringGenerator().fill(new ArrayList<String>(), 10));
		System.out.println(new StringGenerator().fill(new LinkedList<String>(), 5));
		System.out.println(new StringGenerator().fill(new HashSet<String>(), 3));
		System.out.println(new StringGenerator().fill(new LinkedHashSet<String>(), 15));
		System.out.println(new StringGenerator().fill(new TreeSet<String>(), 2));
	}
}
