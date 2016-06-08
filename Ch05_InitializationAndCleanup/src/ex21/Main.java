package ex21;

public class Main {

	public static void main(String[] args) {
		for (Currency cur : Currency.values()) {
			System.out.println(cur + " # " + cur.ordinal());
		}
	}
}
