package JavaCollection.SetInterface;
import java.util.*;
class SetOperations{
    static <T> Set<T> union(Set<T> s1,Set<T> s2){
        Set<T> res=new HashSet<>(s1);
        res.addAll(s2);
        return res;
    }
    static <T> Set<T> intersection(Set<T> s1,Set<T> s2){
        Set<T> res=new HashSet<>();
        for(T i:s1){
            if(s2.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}
public class UnionAndIntersectionOfTwoSets{
    public static void main(String[] args){
        Set<Integer> s1=new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        Set<Integer> s2=new HashSet<>();
        s2.add(3);
        s2.add(4);
        s2.add(5);
        System.out.println(SetOperations.union(s1,s2));
        System.out.println(SetOperations.intersection(s1,s2));
    }
}