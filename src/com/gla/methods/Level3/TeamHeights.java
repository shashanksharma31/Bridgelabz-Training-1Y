package com.gla.method.Level3;

import java.util.*;
public class TeamHeights{
static int sum(int[] a){int s=0;for(int x:a)s+=x;return s;}
static double mean(int[] a){return sum(a)/(double)a.length;}
static int min(int[] a){int m=a[0];for(int x:a)m=Math.min(m,x);return m;}
static int max(int[] a){int m=a[0];for(int x:a)m=Math.max(m,x);return m;}
public static void main(String[] args){
int[] h=new int[11];
for(int i=0;i<11;i++)h[i]=(int)(Math.random()*101)+150;
System.out.println(Arrays.toString(h));
System.out.println(mean(h)+" "+min(h)+" "+max(h));
}}
