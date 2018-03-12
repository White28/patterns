package com.white.structural.decorator;

/**
 * @author Dmytro Bilyi
 *
 * @date Mar 12, 2018
 * 
 */
public class CarDecorator implements Car {

	protected Car car;

	public CarDecorator(Car c) {
		this.car = c;
	}

	@Override
	public void assemble() {
		this.car.assemble();
	}
}
