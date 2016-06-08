//: typeinfo/pets/Dog.java
package ex15.typeinfo.pets;

public class Dog extends Pet {
	public Dog(String name) {
		super(name);
	}

	public Dog() {
		super();
	}

	public static class Factory implements typeinfo.factory.Factory<Dog> {
		public Dog create() {
			return new Dog();
		}
	}
} // /:~
