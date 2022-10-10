package com.java.array;

public class DuplicateElement {
    public static void main(String[] args) {



       int arr[] = { 34, 54, 52, 42, 11, 17, 32, 32, 52, 1, 8 };



       for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    break;
                }



               if (arr[i] == arr[j]) {
                    count++;
                }



           }
            if(count>1)
            System.out.println(arr[i] + "--> " + count);
        }
    }
}