package ex16;

public class Coffee {
	private static long counter = 0;
	private final long id = counter++;

	public String toString() {
		return getClass().getSimpleName() + " " + id;
	}

	public static class Factory implements typeinfo.factory.Factory<Coffee> {
		public Coffee create() {
			return new Coffee();
		}
	}
}
