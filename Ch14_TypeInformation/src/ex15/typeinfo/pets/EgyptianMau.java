//: typeinfo/pets/EgyptianMau.java
package ex15.typeinfo.pets;

public class EgyptianMau extends Cat {
	public EgyptianMau(String name) {
		super(name);
	}

	public EgyptianMau() {
		super();
	}

	public static class Factory implements
			typeinfo.factory.Factory<EgyptianMau> {
		public EgyptianMau create() {
			return new EgyptianMau();
		}
	}
} // /:~
