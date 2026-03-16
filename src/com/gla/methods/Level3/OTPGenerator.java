package com.gla.method.Level3;

import java.util.*;
public class OTPGenerator{
static int otp(){return (int)(Math.random()*900000)+100000;}
public static void main(String[] a){int[] o=new int[10];for(int i=0;i<10;i++){o[i]=otp();System.out.println(o[i]);}}}
