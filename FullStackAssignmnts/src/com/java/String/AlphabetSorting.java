package com.java.String;

import java.util.Arrays;
import java.util.Collections;

public class AlphabetSorting {

	static String s = "Successfully enter";

	public static void main(String[] args) {

		String[] ch = { "i", "b", "z", "a" };
		Arrays.sort(ch);
		System.out.println("Alphabet sorted in Assending order -->" + Arrays.toString(ch));

		Arrays.sort(ch, Collections.reverseOrder());

		System.out.println("Alphabet sorted in descending order -->" + Arrays.toString(ch));

	}
}