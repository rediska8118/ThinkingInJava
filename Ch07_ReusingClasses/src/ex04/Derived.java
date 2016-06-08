package ex04;

public class Derived extends Base{

	public Derived() {
		System.out.println("Derived contructor");
	}
	
	public static void main(String[] args) {
		System.out.println(new Derived());
	}
}
