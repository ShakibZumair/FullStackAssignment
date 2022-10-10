package com.java.String;

public class VowelsRemove {
	static String s = "WElcome";

	public static void main(String[] args) {
		System.out.println("Before removing of vowels --> " + s.toUpperCase());

		for (int i = 0; i < s.length(); i++) {
			char ch = s.toUpperCase().charAt(i);
			if (ch != 65 && ch != 69 && ch != 73 && ch != 79 && ch != 85) {
				System.out.print(ch);
			}
		}
	}
}