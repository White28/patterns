package com.white.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 11, 2018
 * 
 */
public class Students implements Cloneable {

	private List<String> listOfStudents;

	public Students() {
		listOfStudents = new ArrayList<>();
	}

	public Students(List<String> list) {
		this.listOfStudents = list;
	}

	/**
	 * 
	 * In this method you can get data from database and put into the list
	 * 
	 */
	public void loadData() {
		listOfStudents.add("John");
		listOfStudents.add("Alex");
		listOfStudents.add("Tom");
		listOfStudents.add("Peter");
	}

	public List<String> getListOfStudents() {
		return listOfStudents;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<>();
		for (String s : this.getListOfStudents()) {
			temp.add(s);
		}
		return new Students(temp);
	}
}
