package com.white.creational.abstractfactory;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 8, 2018
 * 
 */
public class AbstractFactoryMain {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
		Computer server =
				ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));

		System.out.format("AbstractFactory PC Config: RAM = %s, HDD = %s, CPU = %s", pc.getRAM(),
				pc.getHDD(), pc.getCPU());
		System.out.format("%nAbstractFactory Server Config: RAM = %s, HDD = %s, CPU = %s",
				server.getRAM(), server.getHDD(), server.getCPU());
	}
}
