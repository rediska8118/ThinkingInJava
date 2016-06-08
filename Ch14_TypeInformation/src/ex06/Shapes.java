package ex06;

import java.util.Arrays;
import java.util.List;

abstract class Shape {

	void draw() {
		System.out.println(this + ".draw()");
	}

	abstract public String toString();
}

class Circle extends Shape {
	boolean flag = true;

	public String toString() {
		return "Circle " + flag;
	}
}

class Square extends Shape {
	boolean flag = true;

	public String toString() {
		return "Square " + flag;
	}
}

class Triangle extends Shape {
	boolean flag = true;

	public String toString() {
		return "Triangle " + flag;
	}
}

class Rhomboid extends Shape {
	boolean flag = true;

	public String toString() {
		return "Rhomboid " + flag;
	}
}

public class Shapes {
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(),
				new Triangle(), new Rhomboid());
		for (Shape shape : shapeList) {
			
			if(shape instanceof Circle) ((Circle) shape).flag = false;
			System.out.println(shape);
		}

	}
}
