//: typeinfo/pets/Rodent.java
package ex15.typeinfo.pets;

public class Rodent extends Pet {
	public Rodent(String name) {
		super(name);
	}

	public Rodent() {
		super();
	}

	public static class Factory implements typeinfo.factory.Factory<Rodent> {
		public Rodent create() {
			return new Rodent();
		}
	}
} // /:~
