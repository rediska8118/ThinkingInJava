package ex26;

import java.util.Random;

public class RandomInstrumentGenerator {
	private Random rand = new Random();

	public Instrument next() {
		switch (rand.nextInt(7)) {
		default:
		case 0:
			return new Wind();
		case 1:
			return new Percussion();
		case 2:
			return new Stringed();
		case 3:
			return new Keyboard();
		case 4:
			return new Brass();
		case 5:
			return new Woodwind();
		case 6:
			return new Piano();
		}
	}
}
