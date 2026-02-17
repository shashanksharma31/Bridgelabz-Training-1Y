package com.gla.method.Level1;

import java.util.*;
public class QuotientRemainder{
    public static int[] findRemainderAndQuotient(int n,int d){
        return new int[]{n/d,n%d};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),d=sc.nextInt();
        int[] r=findRemainderAndQuotient(n,d);
        System.out.println(r[0]+" "+r[1]);
    }
}
