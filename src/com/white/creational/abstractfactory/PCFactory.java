package com.white.creational.abstractfactory;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 8, 2018
 * 
 */
public class PCFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;

	public PCFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		return new PC(ram, hdd, cpu);
	}
}
