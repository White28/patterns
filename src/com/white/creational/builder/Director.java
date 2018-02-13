package com.white.creational.builder;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 13, 2018
 * 
 */
public class Director {

	public void constructSportsCar(Builder builder) {
		builder.setType("SportsCar");
		builder.setSeats(2);
		builder.setTransmission("Semi-automatic");
		builder.setEngine("3.0");
	}

	public void constructSUV(Builder builder) {
		builder.setType("SUV");
		builder.setSeats(4);
		builder.setTransmission("Manual");
		builder.setEngine("2.5");
	}
}
