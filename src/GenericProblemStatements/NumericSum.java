package GenericProblemStatements;
import java.util.*;
class SumUtil{
    static double sumNumbers(List<? extends Number> list){
        double sum=0;
        for(Number n:list){
            sum=sum+n.doubleValue();
        }
        return sum;
    }
}
public class NumericSum{
    public static void main(String[] args){
        List<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        System.out.println(SumUtil.sumNumbers(l1));
        List<Double> l2=new ArrayList<>();
        l2.add(5.5);
        l2.add(2.5);
        l2.add(1.0);
        System.out.println(SumUtil.sumNumbers(l2));
    }
}