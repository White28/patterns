package com.white.creational.abstractfactory;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 8, 2018
 * 
 */
public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}
