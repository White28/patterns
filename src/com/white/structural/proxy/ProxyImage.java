package com.white.structural.proxy;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 28, 2018
 * 
 */
public class ProxyImage implements Image {

	private RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
}
