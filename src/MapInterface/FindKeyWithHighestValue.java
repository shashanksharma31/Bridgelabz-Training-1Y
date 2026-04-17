package MapInterface;
import java.util.*;

class MaxValueUtil{
    static String findMaxKey(Map<String,Integer> map){
        String maxKey=null;
        int maxValue=Integer.MIN_VALUE;

        for(String key:map.keySet()){
            int val=map.get(key);
            if(val>maxValue){
                maxValue=val;
                maxKey=key;
            }
        }
        return maxKey;
    }
}

public class FindKeyWithHighestValue{
    public static void main(String[] args){

        Map<String,Integer> map=new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",15);

        System.out.println(MaxValueUtil.findMaxKey(map));
    }
}