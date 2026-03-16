package com.gla.method.Level3;

public class MatrixAdvanced{
static int det2(int[][] m){return m[0][0]*m[1][1]-m[0][1]*m[1][0];}
public static void main(String[] a){int[][] m={{1,2},{3,4}};System.out.println(det2(m));}}
