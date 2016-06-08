package ex19;

import java.util.Arrays;

public class Main {

	static void setVarargs(String... varargs) {

		System.out.println(Arrays.toString(varargs));
	}

	public static void main(String[] args) {
		setVarargs(new String[10]);
		setVarargs("aaa", "bbb");
	}
}
