package ex04;

import java.util.Random;

import ex03.Circle;
import ex03.Shape;
import ex03.Square;
import ex03.Triangle;

public class RandomShapeGenerator {

	private Random rand = new Random();

	public Shape next() {
		switch (rand.nextInt(5)) {
		default:
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Triangle();
		case 3:
			return new Rectangle();
		}
	}
}
