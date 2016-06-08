//: typeinfo/pets/Manx.java
package ex15.typeinfo.pets;

public class Manx extends Cat {
  public Manx(String name) { super(name); }
  public Manx() { super(); }
  
  public static class Factory implements typeinfo.factory.Factory<Manx> {
		public Manx create() {
			return new Manx();
		}
	}
} ///:~
