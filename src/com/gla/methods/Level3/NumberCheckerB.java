package com.gla.method.Level3;

import java.util.*;
public class NumberCheckerB{
static int[] digits(int n){char[] c=String.valueOf(n).toCharArray();int[] d=new int[c.length];for(int i=0;i<c.length;i++)d[i]=c[i]-'0';return d;}
static int sum(int[] d){int s=0;for(int x:d)s+=x;return s;}
static boolean harshad(int n){return n%sum(digits(n))==0;}
static int[][] freq(int[] d){int[][] f=new int[10][2];for(int i=0;i<10;i++){f[i][0]=i;}
for(int x:d)f[x][1]++;return f;}
public static void main(String[] args){int n=21;int[] d=digits(n);System.out.println(sum(d));System.out.println(harshad(n));System.out.println(Arrays.deepToString(freq(d)));}}
