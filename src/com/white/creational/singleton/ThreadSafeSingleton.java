package com.white.creational.singleton;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 6, 2018
 * 
 */
public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {}

	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
}
