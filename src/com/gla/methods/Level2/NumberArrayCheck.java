package com.gla.method.Level2;

import java.util.*;
public class NumberArrayCheck{
    static boolean isPositive(int n){return n>=0;}
    static boolean isEven(int n){return n%2==0;}
    static int compare(int a,int b){return a>b?1:(a==b?0:-1);}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);int[] a=new int[5];
        for(int i=0;i<5;i++){a[i]=sc.nextInt();
            if(isPositive(a[i]))System.out.println(isEven(a[i])?"Even":"Odd");
            else System.out.println("Negative");
        }
        System.out.println(compare(a[0],a[4]));
    }
}
