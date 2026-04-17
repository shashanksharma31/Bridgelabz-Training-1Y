package JavaCollection;
import java.util.*;
class RotateUtil{
    static <T> void rotate(List<T> list,int k){
        int n=list.size();
        k=k%n;
        List<T> temp=new ArrayList<>();
        for(int i=k;i<n;i++){
            temp.add(list.get(i));
        }
        for(int i=0;i<k;i++){
            temp.add(list.get(i));
        }
        for(int i=0;i<n;i++){
            list.set(i,temp.get(i));
        }
    }
}
public class RotateElementsInList{
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        RotateUtil.rotate(list,2);
        System.out.println(list);
    }
}