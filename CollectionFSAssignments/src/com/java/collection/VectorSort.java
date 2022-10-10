package com.java.collection;

import java.util.Collections;
import java.util.Vector;

public class VectorSort {
public static void main(String[] args) {
		
		Vector<String> item=new Vector<>();
		   item.add("waterbottle");
		   item.add("chair");
		   item.add("laptop");
		   item.add("mobile");
		   item.add("charger");
		   
		 Collections.sort(item);
		 
		System.out.println("Sorted vector item is : "+ item);
		   
		   
	}
}
