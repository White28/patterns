package com.white.creational.builder;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 13, 2018
 * 
 */
public interface Builder {

	public void setType(String type);

	public void setSeats(int seats);

	public void setTransmission(String transmission);

	public void setEngine(String engine);
}
