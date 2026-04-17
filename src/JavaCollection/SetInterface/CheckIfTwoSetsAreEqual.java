package JavaCollection.SetInterface;
import java.util.*;
class SetUtil{
    static <T> boolean isEqual(Set<T> s1,Set<T> s2){
        if(s1.size()!=s2.size()){
            return false;
        }
        for(T i:s1){
            if(!s2.contains(i)){
                return false;
            }
        }
        return true;
    }
}
public class CheckIfTwoSetsAreEqual{
    public static void main(String[] args){
        Set<Integer> s1=new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        Set<Integer> s2=new HashSet<>();
        s2.add(3);
        s2.add(2);
        s2.add(1);
        System.out.println(SetUtil.isEqual(s1,s2));
    }
}