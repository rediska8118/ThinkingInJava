package ex16;

public class Tricycle implements ICycle {

	@Override
	public void ride() {
		System.out.println("Tricycle.ride()");
	}

	public static ICycleFactory cycleFactory = new ICycleFactory() {

		@Override
		public ICycle getCycle() {
			return new Tricycle();
		}
	};

}
