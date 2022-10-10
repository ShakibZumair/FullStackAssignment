package com.java.jdk8.assignment1;

import java.util.Arrays;

interface Check {


	    void print ();

}


public class Palindrome {
	

	   public static void main(String[] args) {
	        
	        String number="18281";
	        char ch[]=number.toCharArray();
	        char temp[]=new char[number.length()];
	        
	        Check c=()->{
	            int j=0;
	            for(int i=ch.length-1;i>=0;i--) {
	                temp[j++]=ch[i];
	            }
	            if( Arrays.equals(ch, temp)) {
	                System.out.println("number is palindrom -> "+number);
	            }
	            else {
	                System.out.println("number is not palindrom");
	            }
	        };
	        c.print();
		
}
}
