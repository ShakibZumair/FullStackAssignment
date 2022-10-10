package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateRemove {
	public static void main(String[] args) {
		
		  List<Integer> Numbers = new ArrayList<Integer>();
				Numbers.add(1);
				Numbers.add(2);
				Numbers.add(3);
				Numbers.add(2);
				Numbers.add(0);
				Numbers.add(3);
				Numbers.add(3);
				
			
			   Collections.sort(Numbers);	
			   System.out.println("List before remove duplicate elements "+Numbers);
				
			Set<Integer> Removeduplicate=new HashSet<>(Numbers);
			
			System.out.println("After Removing duplicates: " +Removeduplicate);
			
			

			}
}
