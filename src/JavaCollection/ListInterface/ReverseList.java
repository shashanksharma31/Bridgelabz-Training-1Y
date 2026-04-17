package GenericProblemStatements;
import java.util.*;
class ReverseUtil{
    static <T> void reverseList(List<T> list){
        int start=0;
        int end=list.size()-1;
        while(start<end){
            T temp=list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
    }
}
public class ReverseList{
    public static void main(String[] args){
        List<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        ReverseUtil.reverseList(a);
        System.out.println(a);
        List<Integer> b=new LinkedList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);
        ReverseUtil.reverseList(b);
        System.out.println(b);
    }
}