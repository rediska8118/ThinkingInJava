package ex25;

public class Show implements I1, I2 {

	@Override
	public void dance() {
		System.out.println("Show.dance()");
	}

	@Override
	public void sing() {
		System.out.println("Show.sing()");
	}
	
}
