package com.white.structural.composite;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 25, 2018
 * 
 */
public class CompositeMain {

	public static void main(String[] args) {

		Shape triangleOne = new Triangle();
		Shape triangleTwo = new Triangle();
		Shape circle = new Circle();

		Drawing drawing = new Drawing();
		drawing.add(triangleOne);
		drawing.add(triangleTwo);
		drawing.add(circle);

		drawing.draw("Red");

		drawing.clear();

		drawing.add(triangleOne);
		drawing.add(circle);

		drawing.draw("Green");
	}
}
