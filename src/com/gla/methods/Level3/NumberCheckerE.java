package com.gla.method.Level3;

public class NumberCheckerE{
static int fact(int n){int f=1;for(int i=1;i<=n;i++)f*=i;return f;}
static boolean strong(int n){int s=0;for(char c:String.valueOf(n).toCharArray())s+=fact(c-'0');return s==n;}
public static void main(String[] a){System.out.println(strong(145));}}
