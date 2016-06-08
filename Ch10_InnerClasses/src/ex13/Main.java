package ex13;

public class Main {

	Interface doIt() {
		return new Interface() {
			@Override
			public void doBest() {
				// TODO Auto-generated method stub
				System.out.println("Interface.doBest()");
			}
		};
	}

	public static void main(String[] args) {

		Main main = new Main();
		main.doIt().doBest();
	}
}
