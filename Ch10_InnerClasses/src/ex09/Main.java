package ex09;

public class Main {

	Interface doIt() {
		return new Best();
	}

	class Best implements Interface {
		@Override
		public void doBest() {
			// TODO Auto-generated method stub
			System.out.println("Best.doBest()");
		}
	}

	public static void main(String[] args) {

		Main main = new Main();
		main.doIt().doBest();
	}
}
