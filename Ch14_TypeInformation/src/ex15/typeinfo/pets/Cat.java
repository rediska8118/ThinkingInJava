//: typeinfo/pets/Cat.java
package ex15.typeinfo.pets;

public class Cat extends Pet {
	public Cat(String name) {
		super(name);
	}

	public Cat() {
		super();
	}

	public static class Factory implements typeinfo.factory.Factory<Cat> {
		public Cat create() {
			return new Cat();
		}
	}
} // /:~
