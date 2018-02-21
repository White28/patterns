package com.white.structural.adapter;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 21, 2018
 * 
 */
public class AdapterMain {

	public static void main(String[] args) {
		SocketAdapter socketClassAdapter = new SocketClassAdapterImpl();

		Volt v3Class = socketClassAdapter.get3Volt();
		Volt v12Class = socketClassAdapter.get12Volt();
		Volt v120Class = socketClassAdapter.get120Volt();

		System.out.println("v3 volts using Class Adapter = " + v3Class.getVolts());
		System.out.println("v12 volts using Class Adapter = " + v12Class.getVolts());
		System.out.println("v120 volts using Class Adapter = " + v120Class.getVolts());


		SocketAdapter socketObjectAdapter = new SocketObjectAdapterImpl();

		Volt v3Object = socketObjectAdapter.get3Volt();
		Volt v12Object = socketObjectAdapter.get12Volt();
		Volt v120Object = socketObjectAdapter.get120Volt();

		System.out.println("v3 volts using Object Adapter = " + v3Object.getVolts());
		System.out.println("v12 volts using Object Adapter = " + v12Object.getVolts());
		System.out.println("v120 volts using Object Adapter = " + v120Object.getVolts());
	}
}
