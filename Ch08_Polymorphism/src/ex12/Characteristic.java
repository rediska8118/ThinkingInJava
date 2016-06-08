package ex12;

public class Characteristic {
	private String str;

	public Characteristic(String str) {
		this.str = str;
		System.out.println(str);
	}

	protected void dispose() {
		System.out.println("disposing characteristics " + str);
	}
}
