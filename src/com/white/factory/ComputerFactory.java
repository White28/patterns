package com.white.factory;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 7, 2018
 * 
 */
public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		if ("PC".equalsIgnoreCase(type)) {
			return new PC(ram, hdd, cpu);
		} else if ("Server".equalsIgnoreCase(type)) {
			return new Server(ram, hdd, cpu);
		}

		return null;
	}
}
