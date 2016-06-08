package ex05;

public class Outer {

	public Outer() {
		System.out.println("Outer constructor");
	}
	
	class Inner{
		Inner(){
			System.out.println("Inner constructor");
		}
	}
}
