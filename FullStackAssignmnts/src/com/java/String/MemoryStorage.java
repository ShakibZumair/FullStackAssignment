package com.java.String;

public class MemoryStorage {
	public static void main(String[] args) {
		String s = "hello";
		String s1 = "hello";
		String s2 = new String("hello");
		String s3 = new String("hello");
		System.out.println("Before changing memory location");
		System.out.println(s == s3);
		s3 = s3.intern();

		System.out.println(s == s1);
		System.out.println(s == s2);
		System.out.println(s2 == s3);
		System.out.println("After changing memory location");
		System.out.println(s == s3);

	}
}