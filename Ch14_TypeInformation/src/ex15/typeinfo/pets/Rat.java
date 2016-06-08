//: typeinfo/pets/Rat.java
package ex15.typeinfo.pets;

public class Rat extends Rodent {
	public Rat(String name) {
		super(name);
	}

	public Rat() {
		super();
	}

	public static class Factory implements typeinfo.factory.Factory<Rat> {
		public Rat create() {
			return new Rat();
		}
	}
} // /:~
