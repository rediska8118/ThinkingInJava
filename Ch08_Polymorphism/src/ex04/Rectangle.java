package ex04;

import ex03.Shape;

public class Rectangle extends Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Rectangle.erase()");
	}

	@Override
	public void rotate() {
		System.out.println("Rectangle.rotate()");
	}
}
