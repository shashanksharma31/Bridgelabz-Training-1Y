package JavaCollection.ListInterface;
import java.util.*;
class RemoveUtil{
    static <T> List<T> removeDuplicates(List<T> list){
        List<T> res=new ArrayList<>();
        for(T i:list){
            if(!res.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}
public class RemoveDuplicatesWhilePreservingOrder{
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(RemoveUtil.removeDuplicates(list));
    }
}