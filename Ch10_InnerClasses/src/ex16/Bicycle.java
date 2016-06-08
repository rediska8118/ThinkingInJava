package ex16;

public class Bicycle implements ICycle {

	@Override
	public void ride() {
		// TODO Auto-generated method stub
		System.out.println("Bicycle.ride()");
	}

	public static ICycleFactory cycleFactory = new ICycleFactory() {

		@Override
		public ICycle getCycle() {
			// TODO Auto-generated method stub
			return new Bicycle();
		}
	};

}
