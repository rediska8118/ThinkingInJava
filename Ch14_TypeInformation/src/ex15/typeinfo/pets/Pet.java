//: typeinfo/pets/Pet.java
package ex15.typeinfo.pets;

public class Pet extends Individual {
	public Pet(String name) {
		super(name);
	}

	public Pet() {
		super();
	}

	public static class Factory implements typeinfo.factory.Factory<Pet> {
		public Pet create() {
			return new Pet();
		}
	}
} // /:~
