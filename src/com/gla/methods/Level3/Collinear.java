package com.gla.method.Level3;

import java.util.*;
public class Collinear{
static boolean check(int x1,int y1,int x2,int y2,int x3,int y3){
return (y2-y1)*(x3-x2)==(y3-y2)*(x2-x1);
}
public static void main(String[] a){System.out.println(check(2,4,4,6,6,8));}}
