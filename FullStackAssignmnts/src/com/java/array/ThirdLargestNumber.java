package com.java.array;

public class ThirdLargestNumber {
    
    static int a []={23,12,10,15,20};




    public static void main(String[] args) {
        int temp;
    for (int i=0;i<a.length;i++) {
        for (int j=i+1;j<a.length;j++) {
        if (a[i]>a[j]) {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        }
    }
    System.out.println("Third Largest Array is => "+ a[a.length-3]);
    }
}

