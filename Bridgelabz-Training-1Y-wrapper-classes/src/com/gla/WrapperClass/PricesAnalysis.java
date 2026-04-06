package scr.com.gla.Wrapper Class;

import java.util.*;

public class PricesAnalysis {
    public static void main(String[] args) {
        double[] arr = {10.5,20,35.75,5.5};
        ArrayList<Double> list = new ArrayList<>();
        for(double x:arr) list.add(x);

        double max = 0, sum = 0;
        for(double x:list){
            if(x > max) max = x;
            sum += x;
        }

        System.out.println(max);
        System.out.println(sum/list.size());
    }
}
