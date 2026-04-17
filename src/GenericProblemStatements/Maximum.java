package GenericProblemStatements;
class MaximumOfThree{
    static <T extends Comparable<T>> T maximum(T x,T y,T z){
        T max=x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        return max;
    }
}
public class Maximum{
    public static void main(String[] args){
        Integer a=10,b=20,c=15;
        System.out.println(MaximumOfThree.maximum(a,b,c));
        Double d1=5.5,d2=2.2,d3=9.1;
        System.out.println(MaximumOfThree.maximum(d1,d2,d3));
        String s1="A",s2="B",s3="C";
        System.out.println(MaximumOfThree.maximum(s1,s2,s3));
    }
}