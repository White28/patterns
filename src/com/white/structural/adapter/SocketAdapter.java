package com.white.structural.adapter;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 21, 2018
 * 
 */
public interface SocketAdapter {

	public Volt get120Volt();

	public Volt get12Volt();

	public Volt get3Volt();
}
