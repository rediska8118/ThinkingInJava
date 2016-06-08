//: typeinfo/pets/Pets.java
// Facade to produce a default PetCreator.
package ex15.typeinfo.pets;

import java.util.*;

import ex15.main.PetFactory;

public class Pets {
	public static final PetCreator creator = new LiteralPetCreator();

	public static Pet randomPet(){
		return PetFactory.createRandom();
	}
//	public static Pet randomPet() {
//		return creator.randomPet();
//	}

	public static Pet[] createArray(int size) {
		return creator.createArray(size);
	}

	public static ArrayList<Pet> arrayList(int size) {
		return creator.arrayList(size);
	}
} // /:~
