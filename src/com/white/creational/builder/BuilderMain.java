package com.white.creational.builder;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 13, 2018
 * 
 */
public class BuilderMain {

	public static void main(String[] args) {

		Director director = new Director();

		CarBuilder builder = new CarBuilder();
		director.constructSportsCar(builder);

		Car car = builder.getResult();
		System.out.println("Car built SportsCar: " + car);

		director.constructSUV(builder);
		Car car2 = builder.getResult();
		System.out.println("Car built SUV: " + car2);
	}
}
