package ex21;

public class Main implements Interface {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Main.show()");
	}

	public static void main(String[] args) {
		Main main = new Main();
		Interface.Inner.doBest(main);
	}

}
