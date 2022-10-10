package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class AssendingOrder {
public static void main(String[] args) {
	ArrayList <Integer> al =new ArrayList <Integer>();
	al.add(11);
	al.add(10);
	al.add(15);
	al.add(7);
	Collections.sort(al);
	System.out.println("List are in assending order "+al);
}
}
