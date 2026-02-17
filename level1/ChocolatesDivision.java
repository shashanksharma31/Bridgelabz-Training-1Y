package com.gla.method.Level1;

import java.util.*;
public class ChocolatesDivision{
    public static int[] findRemainderAndQuotient(int n,int c){
        return new int[]{n/c,n%c};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=sc.nextInt();
        int[] r=findRemainderAndQuotient(n,c);
        System.out.println(r[0]+" "+r[1]);
    }
}
