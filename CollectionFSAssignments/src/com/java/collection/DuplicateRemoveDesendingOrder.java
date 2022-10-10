package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateRemoveDesendingOrder {
	public static void main(String[] args) {
		
		List<String> Item=new ArrayList<String>();
		
		      Item.add("Mobile");
		      Item.add("Laptop");
		      Item.add("Bag");
		      Item.add("Laptop");
		      Item.add("Mobile");
  	System.out.println("Before Removing Duplicate: "+ Item);

			
		Set<String> RemoveDuplicate=new HashSet<String>(Item);
		
		
		List<String> sort=new ArrayList<String>(RemoveDuplicate);
		
		Collections.sort(sort, Collections.reverseOrder());
		
		System.out.println("After Removing List in descendingorder: "+ sort);
		
	}
}
