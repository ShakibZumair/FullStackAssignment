package com.java.array;

public class VowelsAndConsonants {
	public static void main(String[] args) {
		char a[] = { 'y', 'a', 's', 'h', 't', 'e', 'c', 'u' };
		System.out.println("vowels are  ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {
				System.out.print(a[i] + " ");

			}
		}
		System.out.println();
		System.out.println("consonants are ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 'a' && a[i] != 'e' && a[i] != 'i' && a[i] != 'o' && a[i] != 'u') {
				System.out.print(a[i] + " ");
			}
		}
	}

}
