package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DyanamicArray {
    public static void main(String[] args) {



       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :: ");
        int size = sc.nextInt();
        String arr[] = new String[size];
        System.out.println("Enter elements of the array (Strings) :: ");
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.next();
        }
        System.out.println(Arrays.toString(arr));
        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(arr));
        System.out.println("Enter the element that is to be added:");
        String element = sc.next();
        myList.add(element);
        arr = myList.toArray(arr);
        System.out.println(Arrays.toString(arr));
        }



}