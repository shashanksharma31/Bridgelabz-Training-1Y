package com.gla.method.Level3;

public class NumberCheckerD{
static boolean prime(int n){if(n<2)return false;for(int i=2;i*i<=n;i++)if(n%i==0)return false;return true;}
static boolean neon(int n){int s=0;for(char c:String.valueOf(n*n).toCharArray())s+=c-'0';return s==n;}
static boolean buzz(int n){return n%7==0||n%10==7;}
public static void main(String[] a){System.out.println(prime(7)+" "+neon(9)+" "+buzz(27));}}
