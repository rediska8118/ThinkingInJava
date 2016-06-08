package ex15.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ex15.typeinfo.pets.Cat;
import ex15.typeinfo.pets.Cymric;
import ex15.typeinfo.pets.Dog;
import ex15.typeinfo.pets.EgyptianMau;
import ex15.typeinfo.pets.Hamster;
import ex15.typeinfo.pets.Manx;
import ex15.typeinfo.pets.Mouse;
import ex15.typeinfo.pets.Mutt;
import ex15.typeinfo.pets.Pet;
import ex15.typeinfo.pets.Pug;
import ex15.typeinfo.pets.Rat;
import ex15.typeinfo.pets.Rodent;
import typeinfo.factory.Factory;

public class PetFactory {
	public String toString() {
		return getClass().getSimpleName();
	}

	static List<Factory<? extends Pet>> petFactories = new ArrayList<Factory<? extends Pet>>();
	static {
		petFactories.add(new Pet.Factory());
		petFactories.add(new Cat.Factory());
		petFactories.add(new Cymric.Factory());
		petFactories.add(new Dog.Factory());
		petFactories.add(new EgyptianMau.Factory());
		petFactories.add(new Hamster.Factory());
		petFactories.add(new Manx.Factory());
		petFactories.add(new Mouse.Factory());
		petFactories.add(new Mutt.Factory());
		petFactories.add(new Pug.Factory());
		petFactories.add(new Rat.Factory());
		petFactories.add(new Rodent.Factory());
	}
	private static Random rand = new Random();

	public static Pet createRandom() {
		int n = rand.nextInt(petFactories.size());
		return petFactories.get(n).create();
	}
}
