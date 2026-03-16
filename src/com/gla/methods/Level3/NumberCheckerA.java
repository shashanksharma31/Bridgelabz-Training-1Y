package com.gla.method.Level3;

import java.util.*;
public class NumberCheckerA{
static int count(int n){return String.valueOf(n).length();}
static int[] digits(int n){char[] c=String.valueOf(n).toCharArray();int[] d=new int[c.length];for(int i=0;i<c.length;i++)d[i]=c[i]-'0';return d;}
static boolean arm(int n){int[] d=digits(n);int p=d.length,s=0;for(int x:d)s+=Math.pow(x,p);return s==n;}
static int[] large(int[] d){int m1=Integer.MIN_VALUE,m2=Integer.MIN_VALUE;for(int x:d){if(x>m1){m2=m1;m1=x;}else if(x>m2)m2=x;}return new int[]{m1,m2};}
static int[] small(int[] d){int m1=Integer.MAX_VALUE,m2=Integer.MAX_VALUE;for(int x:d){if(x<m1){m2=m1;m1=x;}else if(x<m2)m2=x;}return new int[]{m1,m2};}
public static void main(String[] a){int n=153;int[] d=digits(n);System.out.println(count(n));System.out.println(arm(n));System.out.println(Arrays.toString(large(d)));System.out.println(Arrays.toString(small(d)));}}
