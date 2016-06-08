package ex18;

public class TricycleFactory implements ICycleFactory {

	@Override
	public ICycle getCycle() {
		// TODO Auto-generated method stub
		return new Tricycle();
	}

}
