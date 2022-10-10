package com.java.jdk8.assignment1;

import java.util.Arrays;
import java.util.List;

public class StringIntoAnotherString {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("shakib ", "zumair");

		StringBuilder sb = new StringBuilder();
		list.forEach(sb::append);
		// System.out.println(sb);
		System.out.println(sb.insert(2, ""));
		// String con = sb.toString();

		System.out.println(sb);
	}

}