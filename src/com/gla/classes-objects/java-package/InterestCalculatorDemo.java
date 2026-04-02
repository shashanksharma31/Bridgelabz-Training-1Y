package src.com.gla.classes-objects.package-assignment;


import static java.lang.Math.*;

// Program 8: Banking interest calculation
class InterestCalculator{

    double calculateSimpleInterest(double p,double r,double t){
        return (p*r*t)/100;
    }

    double calculateCompoundInterest(double p,double r,double t){
        return p * (pow((1 + r/100), t)) - p;
    }
}

public class InterestCalculatorDemo{
    public static void main(String[] args){

        InterestCalculator i = new InterestCalculator();

        System.out.println("Simple Interest: " + i.calculateSimpleInterest(1000,5,2));
        System.out.println("Compound Interest: " + i.calculateCompoundInterest(1000,5,2));
    }
}
