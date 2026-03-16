package com.gla.method.Level2;

import java.util.*;
public class StudentVoteChecker{
    public boolean canStudentVote(int age){if(age<0)return false;return age>=18;}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StudentVoteChecker s=new StudentVoteChecker();
        for(int i=0;i<10;i++){int a=sc.nextInt();System.out.println(s.canStudentVote(a));}
    }
}
