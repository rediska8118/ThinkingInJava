//: typeinfo/pets/Cymric.java
package ex15.typeinfo.pets;

public class Cymric extends Manx {
	public Cymric(String name) {
		super(name);
	}

	public Cymric() {
		super();
	}

	public static class Factory implements typeinfo.factory.Factory<Cymric> {
		public Cymric create() {
			return new Cymric();
		}
	}
} // /:~
