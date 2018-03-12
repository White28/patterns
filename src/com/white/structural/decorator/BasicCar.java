package com.white.structural.decorator;

/**
 * @author Dmytro Bilyi
 *
 * @date Mar 12, 2018
 * 
 */
public class BasicCar implements Car {

	@Override
	public void assemble() {
		System.out.print("Basic Car.");
	}
}
