package ex10;

public class Main {

	static Interface doIt() {

		class Best implements Interface {
			@Override
			public void doBest() {
				// TODO Auto-generated method stub
				System.out.println("Best.doBest()");
			}
		}

		return new Best();
	}

	public static void main(String[] args) {
		doIt().doBest();
	}
}
