package JavaCollection.ListInterface;
import java.util.*;
class NthUtil{
    static <T> T findNthFromEnd(LinkedList<T> list,int n){
        int i=0;
        int j=0;
        while(j<n){
            j++;
        }
        while(j<list.size()){
            i++;
            j++;
        }
        return list.get(i);
    }
}
public class FindNthElementFromEnd{
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(NthUtil.findNthFromEnd(list,2));
    }
}