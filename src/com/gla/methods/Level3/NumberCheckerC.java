package com.gla.method.Level3;

import java.util.*;
public class NumberCheckerC{
static int[] digits(int n){char[] c=String.valueOf(n).toCharArray();int[] d=new int[c.length];for(int i=0;i<c.length;i++)d[i]=c[i]-'0';return d;}
static boolean palindrome(int n){String s=""+n;return s.equals(new StringBuilder(s).reverse().toString());}
public static void main(String[] args){System.out.println(palindrome(121));}}
