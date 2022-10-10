package com.java.collection.assignment9;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {

		Employee e1 = new Employee(201, "ajay", 1000, "Hr", "mumbai");
		Employee e2 = new Employee(202, "neha", 2000, "software", "pune");
		Employee e3 = new Employee(203, "snahal", 2300, "IT4", "navimumbai");
		Employee e4 = new Employee(204, "vijay", 5000, "Admin", "pune");
		Employee e5 = new Employee(205, "sanjay", 4000, "It1", "mumbai");
		Employee e6 = new Employee(206, "jatin", 10000, "It2", "hydrabad");
		Employee e7 = new Employee(207, "jasmit", 17990, "It3", "mumbai");
		Employee e8 = new Employee(208, "leo", 12000, "Admin", "banglore");
		Employee e9 = new Employee(209, "alizabeth", 7000, "It", "mumbai");
		Employee e10 = new Employee(210, "clark", 8400, "software", "banglore");

		Set<Employee> list = new HashSet<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		list.add(e9);
		list.add(e10);

		for (Employee e : list) {
			System.out.println(e);
		}
	}

}
