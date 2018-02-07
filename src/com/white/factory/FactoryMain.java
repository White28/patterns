package com.white.factory;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 7, 2018
 * 
 */
public class FactoryMain {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
		Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");

		System.out.format("Factory PC Config: RAM = %s, HDD = %s, CPU = %s", pc.getRAM(),
				pc.getHDD(), pc.getCPU());
		System.out.format("%nFactory Server Config: RAM = %s, HDD = %s, CPU = %s", server.getRAM(),
				server.getHDD(), server.getCPU());
	}
}
