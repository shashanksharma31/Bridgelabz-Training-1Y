package com.gla.method.Level1;

import java.util.*;
public class TriangularParkRounds{
    public static double rounds(double a,double b,double c){
        double p=a+b+c;
        return 5000/p;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();
        System.out.println(rounds(a,b,c));
    }
}
