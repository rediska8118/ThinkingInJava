package ex16;

public class Unicycle implements ICycle {

	@Override
	public void ride() {
		System.out.println("Unicycle.ride()");
	}

	public static ICycleFactory cycleFactory = new ICycleFactory() {

		@Override
		public ICycle getCycle() {
			return new Unicycle();
		}
	};

}
