package com.white.structural.decorator;

/**
 * @author Dmytro Bilyi
 *
 * @date Mar 12, 2018
 * 
 */
public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.print(" Adding features of Luxury Car.");
	}
}
