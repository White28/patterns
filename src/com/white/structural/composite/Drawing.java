package com.white.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 25, 2018
 * 
 */
public class Drawing implements Shape {

	/**
	 * Collection of Shapes
	 */
	private List<Shape> shapes = new ArrayList<>();

	@Override
	public void draw(String fillColor) {
		for (Shape shape : shapes) {
			shape.draw(fillColor);
		}
	}

	/**
	 * Adding shape to drawing
	 * 
	 * @param shape the shape that should be adding
	 */
	public void add(Shape shape) {
		this.shapes.add(shape);
	}

	/**
	 * Removing shape from drawing
	 * 
	 * @param shape the shape that should be removing
	 */
	public void remove(Shape shape) {
		this.shapes.remove(shape);
	}

	/**
	 * Removing all the shapes
	 */
	public void clear() {
		System.out.println("Claering all the shapes from drawing");
		this.shapes.clear();
	}
}
