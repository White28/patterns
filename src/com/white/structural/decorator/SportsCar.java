package com.white.structural.decorator;

/**
 * @author Dmytro Bilyi
 *
 * @date Mar 12, 2018
 * 
 */
public class SportsCar extends CarDecorator {

	public SportsCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.print(" Adding features of Sports Car.");
	}
}
