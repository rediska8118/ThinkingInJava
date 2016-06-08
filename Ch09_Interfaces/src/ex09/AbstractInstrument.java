package ex09;

interface Instrument {
	// Compile-time constant:
	int VALUE = 5; // static & final

	// Cannot have method definitions:
	void play(Note n); // Automatically public

	void adjust();
}

public abstract class AbstractInstrument implements Instrument{

	// Cannot have method definitions:
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}; // Automatically public

	public void adjust() {
		System.out.println(this + ".adjust()");
	};
}
