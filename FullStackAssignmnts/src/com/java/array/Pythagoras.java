package com.java.array;

public class Pythagoras {
    
    public static void main(String[] args) {
        
        int a[]={3,4,7,6,9,5,12,15};
        
        
        //To sort array-start
        for(int f=0;f<a.length;f++){
            for(int d=f+1;d<a.length;d++){
                if(a[f]>a[d]){
                    int temp=a[f];
                    a[f]=a[d];
                    a[d]=temp;
                }
            }
        }
        
        //To sort array-End
        
        
        //Logic for pythagoras
        
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int t1=a[i]*a[i];
                int t2=a[j]*a[j];
                for(int p=i+2;p<a.length;p++){
                    int h=a[p]*a[p];
                if(t1+t2==h){
                    System.out.println("Pythagoras comb "+a[i] +" "+a[j]+" "+a[p]);
                }
                }
                
                
            }
        }
        
    }





}