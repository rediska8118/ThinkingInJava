package ex05;

import java.util.Arrays;
import java.util.List;

abstract class Shape {

	void draw() {
		System.out.println(this + ".draw()");
	}

	void rotate() {
		System.out.println(this + ".rotate()");
	}

	abstract public String toString();
}

class Circle extends Shape {
	public String toString() {
		return "Circle";
	}
}

class Square extends Shape {
	public String toString() {
		return "Square";
	}
}

class Triangle extends Shape {
	public String toString() {
		return "Triangle";
	}
}

class Rhomboid extends Shape {
	public String toString() {
		return "Rhomboid";
	}
}

public class Shapes {
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(),
				new Triangle(), new Rhomboid());
		for (Shape shape : shapeList) {
			if (shape instanceof Circle) {
				System.out.println("Circle coudn't be rotated");
				continue;
			}

			shape.rotate();
		}

	}
}
