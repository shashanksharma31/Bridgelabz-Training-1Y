package com.gla.method.Level1;

import java.util.*;
public class SmallestLargestThree{
    public static int[] findSmallestAndLargest(int a,int b,int c){
        int min=a,max=a;
        if(b<min)min=b;
        if(c<min)min=c;
        if(b>max)max=b;
        if(c>max)max=c;
        return new int[]{min,max};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        int[] r=findSmallestAndLargest(a,b,c);
        System.out.println(r[0]+" "+r[1]);
    }
}
