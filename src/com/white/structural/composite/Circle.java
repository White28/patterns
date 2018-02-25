package com.white.structural.composite;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 25, 2018
 * 
 */
public class Circle implements Shape {

	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Circle with color " + fillColor);
	}
}
