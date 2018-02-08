package com.white.creational.singleton;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 6, 2018
 * 
 */
public class SingletonMain {

	public static void main(String[] args) {

		// EagerInitializedSingleton
		EagerInitializedSingleton eager1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton eager2 = EagerInitializedSingleton.getInstance();
		System.out.format(
				"EagerInitializedSingleton %n Instance one: %n  %s %n Instance two: %n  %s %n",
				eager1, eager2);

		// ThreadSafeSingleton
		ThreadSafeSingleton threadSafe1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton threadSafe2 = ThreadSafeSingleton.getInstance();
		System.out.format(
				"%nThreadSafeSingleton %n Instance one: %n  %s %n Instance two: %n  %s %n",
				threadSafe1, threadSafe2);
	}
}
