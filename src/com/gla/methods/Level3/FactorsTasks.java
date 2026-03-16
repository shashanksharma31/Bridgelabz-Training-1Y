package com.gla.method.Level3;

import java.util.*;
public class FactorsTasks{
static int[] f(int n){int c=0;for(int i=1;i<=n;i++)if(n%i==0)c++;int[] a=new int[c];int k=0;for(int i=1;i<=n;i++)if(n%i==0)a[k++]=i;return a;}
public static void main(String[] a){System.out.println(Arrays.toString(f(12)));}}
