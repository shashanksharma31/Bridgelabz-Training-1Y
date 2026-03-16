package com.gla.method.Level3;

import java.util.*;
public class DistanceLine{
static double dist(double x1,double y1,double x2,double y2){return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));}
static double[] line(double x1,double y1,double x2,double y2){double m=(y2-y1)/(x2-x1);double b=y1-m*x1;return new double[]{m,b};}
public static void main(String[] a){System.out.println(dist(1,2,3,4));}}
