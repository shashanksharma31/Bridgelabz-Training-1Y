package com.gla.method.Level1;

import java.util.*;
public class TrigonometricFunctions{
    public static double[] calculateTrigonometricFunctions(double angle){
        double r=Math.toRadians(angle);
        return new double[]{Math.sin(r),Math.cos(r),Math.tan(r)};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double[] r=calculateTrigonometricFunctions(a);
        System.out.println(r[0]+" "+r[1]+" "+r[2]);
    }
}
