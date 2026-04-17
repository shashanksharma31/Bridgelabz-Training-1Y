package JavaCollection.QueueInterface;
import java.util.*;
class QueueUtil{
    static <T> void reverseQueue(Queue<T> q){
        Queue<T> temp=new LinkedList<>();
        while(!q.isEmpty()){
            T x=q.remove();
            int size=temp.size();
            temp.add(x);
            for(int i=0;i<size;i++){
                temp.add(temp.remove());
            }
        }
        while(!temp.isEmpty()){
            q.add(temp.remove());
        }
    }
}
public class ReverseQueue{
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        QueueUtil.reverseQueue(q);
        System.out.println(q);
    }
}