package com.white.structural.decorator;

/**
 * @author Dmytro Bilyi
 *
 * @date Mar 12, 2018
 * 
 */
public class DecoratorMain {

	public static void main(String[] args) {

		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");

		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}
}
