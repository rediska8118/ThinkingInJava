package ex10;

public class Root {
	private Component1 component1 = new Component1(5);
	private Component2 component2 = new Component2(5);
	private Component3 component3 = new Component3(5);
	
	public Root(int i) {
		System.out.println("Root non-def constructor");
	}
}
