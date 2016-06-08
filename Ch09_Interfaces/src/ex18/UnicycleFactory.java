package ex18;

public class UnicycleFactory implements ICycleFactory {

	@Override
	public ICycle getCycle() {
		// TODO Auto-generated method stub
		return new Unicycle();
	}

}
