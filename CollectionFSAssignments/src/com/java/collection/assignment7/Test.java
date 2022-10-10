package com.java.collection.assignment7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		List<Student> sl = new ArrayList<Student>();

		sl.add(new Student(101, "neha", "java", 270));
		sl.add(new Student(102, "amit", "paython", 410));
		sl.add(new Student(103, "jatin", "aws", 350));
		sl.add(new Student(104, "sanjay", "devoops", 370));
		sl.add(new Student(105, "ajay", "data science", 50));

		
		for (Student student : sl) {

			int avg = student.getTotalMarks() * 100 / 500;
			// System.out.println(avg);

			if (avg < 50) {
				System.out.println("Students below 50% :" + avg);
				System.out.println(student.getSname());
			}
			if (avg < 35) {
				System.out.println("Students below 35% :" + avg);
				System.out.println(student.getSname());
			}
			if (avg > 60) {
				System.out.println("Students above 60% :" + avg);
				System.out.println(student.getSname());
			}
		}

		execute(sl);
	}

	private static void execute(List<Student> sl) {
		// TODO Auto-generated method stub

		Collections.sort(sl, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				String sName1 = o1.getSname();
				String sName2 = o2.getSname();

				return sName2.compareTo(sName1);
			}
		});
		System.out.println(sl);
	}
}
