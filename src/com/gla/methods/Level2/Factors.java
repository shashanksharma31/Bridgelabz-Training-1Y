package com.gla.method.Level2;

import java.util.*;
public class Factors{
    public static int[] getFactors(int n){
        int c=0;
        for(int i=1;i<=n;i++)if(n%i==0)c++;
        int[] a=new int[c];int k=0;
        for(int i=1;i<=n;i++)if(n%i==0)a[k++]=i;
        return a;
    }
    public static int sum(int[] a){int s=0;for(int x:a)s+=x;return s;}
    public static long product(int[] a){long p=1;for(int x:a)p*=x;return p;}
    public static double sumSquare(int[] a){double s=0;for(int x:a)s+=Math.pow(x,2);return s;}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);int n=sc.nextInt();
        int[] f=getFactors(n);
        System.out.println(Arrays.toString(f));
        System.out.println(sum(f));
        System.out.println(sumSquare(f));
        System.out.println(product(f));
    }
}
