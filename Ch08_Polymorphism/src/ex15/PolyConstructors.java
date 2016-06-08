package ex15;

class Glyph {
	void draw() {
		System.out.println("Glyph.draw()");
	}

	Glyph() {
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;

	RoundGlyph(int r) {
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
	}

	void draw() {
		System.out.println("RoundGlyph.draw(), radius = " + radius);
	}
}

class RectangularGlyph extends Glyph {
	private int radius = 4;

	RectangularGlyph(int r) {
		radius = r;
		System.out.println("RectangularGlyph.RectangularGlyph(), radius = "
				+ radius);
	}

	void draw() {
		System.out.println("RectangularGlyph.draw(), radius = " + radius);
	}
}

public class PolyConstructors {
	public static void main(String[] args) {
		// new RoundGlyph(5);

		new RectangularGlyph(7);

	}
}