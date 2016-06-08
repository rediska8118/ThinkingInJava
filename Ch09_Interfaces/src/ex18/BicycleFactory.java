package ex18;

public class BicycleFactory implements ICycleFactory {

	@Override
	public ICycle getCycle() {
		// TODO Auto-generated method stub
		return new Bicycle();
	}

}
