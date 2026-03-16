package com.gla.method.Level3;

import java.util.*;
public class MatrixOps{
static int[][] rand(int r,int c){int[][] a=new int[r][c];for(int i=0;i<r;i++)for(int j=0;j<c;j++)a[i][j]=(int)(Math.random()*10);return a;}
public static void main(String[] a){int[][] m=rand(2,2);System.out.println(Arrays.deepToString(m));}}
