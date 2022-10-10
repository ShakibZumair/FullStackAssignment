package com.java.Oops;

import java.util.Scanner;

public class Patient {
    
    String patient;
    double height;
    double weight;
    
    
    public Patient(String patient, double height, double weight) {
        super();
        this.patient = patient;
        this.height = height;
        this.weight = weight;
    }
    
     double computeBMI() {  
                     // BMI = ( Weight in KG / ( Height in Meter x Height in Meter ))
                     return ( weight / ( height * height ));  
                }  
                public static void main(String[] args) {  
                	System.out.println("Enter patient name ");
                     Scanner sc= new Scanner(System.in);
                     Patient patient = new Patient(sc.next(), 177/8.5, 59*5.5);  
                     System.out.println("Name: " + patient.patient + "\nBMI: " + patient.computeBMI());  
                }  



}

