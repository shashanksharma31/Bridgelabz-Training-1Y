package com.gla.method.Level3;

import java.util.*;
public class SimpleCalendar{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
int m=sc.nextInt(),y=sc.nextInt();
Calendar c=new GregorianCalendar(y,m-1,1);
int days=c.getActualMaximum(Calendar.DAY_OF_MONTH);
for(int i=1;i<=days;i++)System.out.print(i+" ");
}}
