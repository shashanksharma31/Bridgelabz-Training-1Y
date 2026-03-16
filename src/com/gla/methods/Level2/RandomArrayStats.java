package com.gla.method.Level2;

import java.util.*;
public class RandomArrayStats{
    public static int[] generate4DigitRandomArray(int s){
        int[] a=new int[s];
        for(int i=0;i<s;i++)a[i]=(int)(Math.random()*9000)+1000;
        return a;
    }
    public static double[] findAverageMinMax(int[] n){
        int min=n[0],max=n[0],sum=0;
        for(int x:n){sum+=x;min=Math.min(min,x);max=Math.max(max,x);}
        return new double[]{sum/(double)n.length,min,max};
    }
    public static void main(String[] args){
        int[] a=generate4DigitRandomArray(5);
        double[] r=findAverageMinMax(a);
        System.out.println(Arrays.toString(a));
        System.out.println(r[0]+" "+r[1]+" "+r[2]);
    }
}
