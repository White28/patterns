package com.white.structural.proxy;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 28, 2018
 * 
 */
public class ProxyMain {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_image.jpg");

		// image will be loaded from disk
		image.display();
		System.out.println();

		// image will not be loaded from disk
		image.display();

		/*
		 * Output: 
		 * Loading test_image.jpg 
		 * Displaying test_image.jpg
		 * 
		 * Displaying test_image.jpg
		 */
	}
}
