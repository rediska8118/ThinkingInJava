package ex20;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	private int i;
	private long l;
	float f;
	double d;
	String str;

	public Main(String str) {
		Scanner sc = new Scanner(str);
		sc.useLocale(Locale.US);

		f = sc.nextFloat();
		d = sc.nextDouble();
		i = sc.nextInt();
		l = sc.nextLong();
		this.str = sc.next();

		sc.close();
	}

	public String toString() {
		return i + " " + l + " " + f + " " + d + " " + str;
	}

	public static void main(String[] args) {
		System.out.println(new Main("3,123 123.123456 123 456789 Hello"));
	}
}
