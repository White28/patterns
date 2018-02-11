package com.white.creational.prototype;

import java.util.List;

/**
 * @author Dmytro Bilyi
 *
 * @date Feb 11, 2018
 * 
 */
public class PrototypeMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		Students students = new Students();
		students.loadData();

		// Use the clone method to get the Student object
		Students studentsNew = (Students) students.clone();
		Students studentsNew1 = (Students) students.clone();
		List<String> list = studentsNew.getListOfStudents();
		list.add("Andrew");
		List<String> list1 = studentsNew1.getListOfStudents();
		list1.remove("Tom");

		System.out.println("Students List: " + students.getListOfStudents());
		System.out.println("studentsNew List: " + list);
		System.out.println("studentsNew1 List: " + list1);
	}
}
