package ex11;

public class Swap implements Processor {

	private String swap(String str) {
		char[] charArr = str.toCharArray();

		for (int i = 0; i < charArr.length; i += 2) {
			char temp = charArr[i];

			if (i + 1 == charArr.length)
				break;

			charArr[i] = charArr[i + 1];
			charArr[i + 1] = temp;
		}

		return new String(charArr);
	}

	public static void main(String[] args) {
		Swap swap = new Swap();

		System.out.println(swap.swap("abcdefg"));
	}

	@Override
	public String name() {
		return "swaps each pair of characters in the argument";
	}

	@Override
	public Object process(Object input) {
		return swap((String) input);
	}
}
