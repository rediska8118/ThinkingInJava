package ex16;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class Sequence implements Readable {
	private int count;
	private char[] arr;

	public Sequence(int count) {
		this.count = count;
		arr = new char[count];
	}

	char[] createSequence() {
		for (int i = 0; i < count; i++)
			arr[i] = Character.forDigit(i, 10);
		return arr;
	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		if (count-- == 0)
			return -1;

		arr = createSequence();

		for (int i = 0; i < count; i++)
			cb.append(arr[i]);
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(new Sequence(10));
		while (scanner.hasNext())
			System.out.println(scanner.next());
	}
}
