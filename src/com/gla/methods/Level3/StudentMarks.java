package com.gla.method.Level3;

import java.util.*;
public class StudentMarks{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);int n=sc.nextInt();
for(int i=0;i<n;i++){int p=(int)(Math.random()*90)+10,c=(int)(Math.random()*90)+10,m=(int)(Math.random()*90)+10;
int t=p+c+m;double avg=t/3.0;double per=t/3.0;
System.out.println(p+" "+c+" "+m+" "+t+" "+avg+" "+per);}}
}
