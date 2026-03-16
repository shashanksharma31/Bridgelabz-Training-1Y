package com.gla.method.Level2;

import java.util.*;
public class FriendsStats{
    public static int youngest(int[] a){int m=0;for(int i=1;i<3;i++)if(a[i]<a[m])m=i;return m;}
    public static int tallest(double[] h){int m=0;for(int i=1;i<3;i++)if(h[i]>h[m])m=i;return m;}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] age=new int[3];double[] h=new double[3];
        for(int i=0;i<3;i++){age[i]=sc.nextInt();h[i]=sc.nextDouble();}
        String[] n={"Amar","Akbar","Anthony"};
        System.out.println(n[youngest(age)]);
        System.out.println(n[tallest(h)]);
    }
}
