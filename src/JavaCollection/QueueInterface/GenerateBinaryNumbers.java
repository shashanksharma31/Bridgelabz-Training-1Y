package JavaCollection.QueueInterface;
import java.util.*;
class BinaryUtil{
    static List<String> generate(int n){
        List<String> res=new ArrayList<>();
        Queue<String> q=new LinkedList<>();
        q.add("1");
        for(int i=0;i<n;i++){
            String s=q.remove();
            res.add(s);
            q.add(s+"0");
            q.add(s+"1");
        }
        return res;
    }
}
public class GenerateBinaryNumbers{
    public static void main(String[] args){
        int n=5;
        System.out.println(BinaryUtil.generate(n));
    }
}