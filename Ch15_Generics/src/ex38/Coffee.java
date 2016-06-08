package ex38;

public class Coffee {
	private static long counter = 0;
	private final long id = counter++;
	private Boolean value;

	public void set(Boolean value) {
		this.value = value;
	}

	public Boolean get() {
		return value;
	}

	public String toString() {
		return getClass().getSimpleName() + " " + id;
	}

}
