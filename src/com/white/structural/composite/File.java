package com.white.structural.composite;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 25, 2018
 * 
 */
public class File {

	private String name;

	public File(String name) {
		this.name = name;
	}

	public void ls() {
		System.out.println(CompositeMain.compositeBuilder + name);
	}
}
