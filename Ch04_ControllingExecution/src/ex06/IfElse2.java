package ex06;

public class IfElse2 {

	static int test(int testval, int begin, int end) {
		if ((testval >= begin) && (testval <= end))
			return +1;
		else if ((testval > begin) && (testval < end))
			return -1;
		else
			return 0; // Match
	}

	public static void main(String[] args) {
		System.out.println(test(10, 1, 10));
		System.out.println(test(5, 2, 10));
		System.out.println(test(5, 6, 10));
	}
}
