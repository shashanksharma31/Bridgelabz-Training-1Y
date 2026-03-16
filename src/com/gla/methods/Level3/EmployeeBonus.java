package com.gla.method.Level3;

public class EmployeeBonus{
public static void main(String[] a){
for(int i=0;i<10;i++){int sal=(int)(Math.random()*90000)+10000;int y=(int)(Math.random()*10);
double b=y>5?sal*0.05:sal*0.02;System.out.println(sal+" "+b+" "+(sal+b));}}
}
