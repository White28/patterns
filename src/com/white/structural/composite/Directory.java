package com.white.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 25, 2018
 * 
 */
public class Directory {

	private String name;
	private List<Object> includedFiles = new ArrayList<>();

	public Directory(String name) {
		this.name = name;
	}

	public void add(Object obj) {
		includedFiles.add(obj);
	}

	public void ls() {
		System.out.println(CompositeMain.compositeBuilder + name);
		CompositeMain.compositeBuilder.append("   ");
		for (Object obj : includedFiles) {
			// Recover the type of this object
			String name = obj.getClass().getSimpleName();
			if (name.equals("Directory")) {
				((Directory) obj).ls();
			} else {
				((File) obj).ls();
			}
		}
		CompositeMain.compositeBuilder.setLength(CompositeMain.compositeBuilder.length() - 3);
	}
}
