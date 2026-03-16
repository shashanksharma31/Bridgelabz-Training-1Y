package com.gla.method.Level2;

import java.util.*;
public class BMIProgram{
    static double bmi(double w,double hcm){double m=hcm/100;return w/(m*m);}
    static String status(double b){
        if(b<18.5)return "Underweight";
        if(b<25)return "Normal";
        if(b<30)return "Overweight";
        return "Obese";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            double w=sc.nextDouble(),h=sc.nextDouble();
            double b=bmi(w,h);
            System.out.println(w+" "+h+" "+b+" "+status(b));
        }
    }
}
