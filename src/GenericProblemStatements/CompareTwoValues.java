package GenericProblemStatements;
class Compare{
    static <T> boolean isEqual(T a,T b){
        return a.equals(b);
    }
}
public class CompareTwoValues{
    public static void main(String[] args){
        Integer x=10;
        Integer y=10;
        System.out.println(Compare.isEqual(x,y));
        String s1="Hello";
        String s2="Hello";
        System.out.println(Compare.isEqual(s1,s2));
        Double d1=5.5;
        Double d2=6.5;
        System.out.println(Compare.isEqual(d1,d2));
    }
}