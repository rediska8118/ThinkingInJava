package ex10;

public class Stem extends Root {

	public Stem(int i) {
		super(i);
		System.out.println("Stem non-def constructor");
	}

	public static void main(String[] args) {
		System.out.println(new Stem(5));
	}
}
