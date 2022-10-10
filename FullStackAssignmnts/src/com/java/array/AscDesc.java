package com.java.array;

import java.util.Arrays;

public class AscDesc {
    public static void main(String[] args) {



       int[] a = { 1, 4, 66, 433, 45, 22, 44, 65 };



       int temp = 0;
        int size = a.length / 2;
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                if (a[i] < a[j]) {



                   temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;



               }



           }



       }
        for (int i = size + 1; i < a.length; i++) {
            for (int j = size + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }



       }
        System.out.print(Arrays.toString(a));
    }



}
