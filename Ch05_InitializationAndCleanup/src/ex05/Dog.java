package ex05;

public class Dog {

	void bark() {
		System.out.println("default");
	}

	void bark(int i) {
		System.out.println("int");
	}

	void bark(char ch) {
		System.out.println("char");
	}

	void bark(long l) {
		System.out.println("long");
	}

	void bark(float f) {
		System.out.println("float");
	}

	public static void main(String[] args) {
		Dog dog = new Dog();

		dog.bark();
		dog.bark(0);
		dog.bark('a');
		dog.bark(10L);
		dog.bark(10f);
	}
}
