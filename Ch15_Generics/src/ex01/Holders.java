package ex01;

import typeinfo.pets.*;

public class Holders<T> {

	private T a;

	public Holders(T a) {
		this.a = a;
	}

	public void set(T a) {
		this.a = a;
	}

	public T get() {
		return a;
	}

	public static void main(String[] args) {
		Holders<Pet> holders = new Holders<Pet>(new Cat());
		Pet pet = holders.get();
		System.out.println(pet);
	}

}
