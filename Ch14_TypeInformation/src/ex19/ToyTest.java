//: typeinfo/toys/ToyTest.java
// Testing class Class.
package ex19;

import static net.mindview.util.Print.*;

import java.lang.reflect.InvocationTargetException;

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
	// Comment out the following default constructor
	// to see NoSuchMethodError from (*1*)
	Toy() {
		print("Creating Toy() object");
	}

	Toy(int i) {
		print("Creating Toy(" + i + ") object");
	}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
	FancyToy() {
		super(1);
	}
}

public class ToyTest {
	static void printInfo(Class cc) {
		print("Class name: " + cc.getName() + " is interface? ["
				+ cc.isInterface() + "]");
		print("Simple name: " + cc.getSimpleName());
		print("Canonical name : " + cc.getCanonicalName());
	}

	public static void main(String[] args) {
		try {
			Toy.class.getDeclaredConstructor(int.class).newInstance(1);
		// catch four exceptions:
		} catch(NoSuchMethodException e) {
			print("No such method: " + e);
		} catch(InstantiationException e) {
			print("Unable make Toy: " + e);
		} catch(IllegalAccessException e) {
			print("Unable access: " + e);
		} catch(InvocationTargetException e) {
			print("Target invocation problem: " + e);
		}
	}
} /*
 * Output: Class name: typeinfo.toys.FancyToy is interface? [false] Simple name:
 * FancyToy Canonical name : typeinfo.toys.FancyToy Class name:
 * typeinfo.toys.HasBatteries is interface? [true] Simple name: HasBatteries
 * Canonical name : typeinfo.toys.HasBatteries Class name:
 * typeinfo.toys.Waterproof is interface? [true] Simple name: Waterproof
 * Canonical name : typeinfo.toys.Waterproof Class name: typeinfo.toys.Shoots is
 * interface? [true] Simple name: Shoots Canonical name : typeinfo.toys.Shoots
 * Class name: typeinfo.toys.Toy is interface? [false] Simple name: Toy
 * Canonical name : typeinfo.toys.Toy
 */// :~
