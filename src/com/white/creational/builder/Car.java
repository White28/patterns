package com.white.creational.builder;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 13, 2018
 * 
 */
public class Car {

	private String type;
	private int seats;
	private String transmission;
	private String engine;

	public Car(String type, int seats, String transmission, String engine) {
		this.type = type;
		this.seats = seats;
		this.transmission = transmission;
		this.engine = engine;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car type=" + type + ", seats=" + seats + ", transmission=" + transmission
				+ ", engine=" + engine;
	}
}
