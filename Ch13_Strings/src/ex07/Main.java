package ex07;

public class Main {

	public static void main(String[] args) {
		String pattern = "^[A-Z].*[\\.]$";
		String s1 = "Split the string Splitting.";
		String s2 = "Split the string Splitting";
		String s3 = "split the string Splitting.";

		System.out.println(s1.matches(pattern));
		System.out.println(s2.matches(pattern));
		System.out.println(s3.matches(pattern));

	}
}
