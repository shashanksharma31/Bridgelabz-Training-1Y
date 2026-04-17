package JavaCollection.SetInterface;
import java.util.*;
class SetUtils{
    static <T> Set<T> symmetricDifference(Set<T> s1,Set<T> s2){
        Set<T> res=new HashSet<>();
        for(T i:s1){
            if(!s2.contains(i)){
                res.add(i);
            }
        }
        for(T i:s2){
            if(!s1.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}
public class SymmetricDifference{
    public static void main(String[] args){
        Set<Integer> s1=new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        Set<Integer> s2=new HashSet<>();
        s2.add(3);
        s2.add(4);
        s2.add(5);
        System.out.println(SetUtils.symmetricDifference(s1,s2));
    }
}