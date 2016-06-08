package ex15;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String str = "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—";
		Stack<String> stack = new Stack<>();

		String[] strArr = str.split("(?!^)");
		System.out.println(Arrays.asList(strArr));

		for (int i = 0; i < strArr.length; i++) {

			if (strArr[i].equals("+")) {
				stack.push(strArr[i + 1]);
				i++;
			}

			if (strArr[i].equals("-")) {
				System.out.print(stack.pop());				
			}
		}
		
		System.out.println("Stack: " + stack.toString());

	}
}
