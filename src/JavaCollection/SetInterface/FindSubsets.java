package JavaCollection.SetInterface;
import java.util.*;
class Setutils{
    static <T> boolean isSubset(Set<T> s1,Set<T> s2){
        for(T i:s1){
            if(!s2.contains(i)){
                return false;
            }
        }
        return true;
    }
}
public class FindSubsets{
    public static void main(String[] args){
        Set<Integer> s1=new HashSet<>();
        s1.add(2);
        s1.add(3);
        Set<Integer> s2=new HashSet<>();
        s2.add(1);
        s2.add(2);
        s2.add(3);
        s2.add(4);
        System.out.println(Setutils.isSubset(s1,s2));
    }
}