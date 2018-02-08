package com.white.creational.singleton;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 6, 2018
 * 
 */
public class EagerInitializedSingleton {

	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	// Private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton() {}

	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
}
