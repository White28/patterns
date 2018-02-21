package com.white.structural.adapter;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 21, 2018
 * 
 */
public class Socket {

	public Volt getVolt() {
		return new Volt(120);
	}
}
