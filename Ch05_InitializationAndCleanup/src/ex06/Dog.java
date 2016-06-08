package ex06;

public class Dog {

	void bark() {
		System.out.println("default");
	}

	void bark(int i, char ch) {
		System.out.println("int-char");
	}

	void bark(char ch, int i) {
		System.out.println("char-int");
	}

	void bark(long l) {
		System.out.println("long");
	}

	void bark(float f) {
		System.out.println("float");
	}

	public static void main(String[] args) {
		Dog dog = new Dog();

		dog.bark(10, 'a');
		dog.bark('a', 10);

	}
}
