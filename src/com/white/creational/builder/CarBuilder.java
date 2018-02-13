package com.white.creational.builder;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 13, 2018
 * 
 */
public class CarBuilder implements Builder {

	private String type;
	private int seats;
	private String transmission;
	private String engine;

	@Override
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	@Override
	public void setEngine(String engine) {
		this.engine = engine;
	}

	public Car getResult() {
		return new Car(type, seats, transmission, engine);
	}
}
