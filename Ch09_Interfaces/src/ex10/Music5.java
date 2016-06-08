package ex10;

import ex09.Note;

interface Instrument {
	// Compile-time constant:
	int VALUE = 5; // static & final

	void adjust();
}

interface Playable {

	// Cannot have method definitions:
	void play(Note n); // Automatically public
}

class Wind implements Instrument, Playable {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}

	public String toString() {
		return "Wind";
	}

	public void adjust() {
		System.out.println(this + ".adjust()");
	}
}

class Percussion implements Instrument, Playable {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}

	public String toString() {
		return "Percussion";
	}

	public void adjust() {
		System.out.println(this + ".adjust()");
	}
}

class Stringed implements Instrument, Playable {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}

	public String toString() {
		return "Stringed";
	}

	public void adjust() {
		System.out.println(this + ".adjust()");
	}
}

class Brass extends Wind {
	public String toString() {
		return "Brass";
	}
}

class Woodwind extends Wind {
	public String toString() {
		return "Woodwind";
	}
}

public class Music5 {
	// Doesn’t care about type, so new types
	// added to the system still work right:
	static void tune(Playable p) {
		// ...
		p.play(Note.MIDDLE_C);
	}

	static void tuneAll(Playable[] arr) {
		for (Playable p : arr)
			tune(p);
	}

	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Playable[] orchestra = { new Wind(), new Percussion(), new Stringed(),
				new Brass(), new Woodwind() };
		tuneAll(orchestra);
	}
}