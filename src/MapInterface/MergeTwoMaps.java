package MapInterface;
import java.util.*;

class MergeUtil{
    static Map<String,Integer> mergeMaps(Map<String,Integer> m1,Map<String,Integer> m2){
        Map<String,Integer> res=new HashMap<>();

        for(String key:m1.keySet()){
            res.put(key,m1.get(key));
        }

        for(String key:m2.keySet()){
            if(res.containsKey(key)){
                res.put(key,res.get(key)+m2.get(key));
            }else{
                res.put(key,m2.get(key));
            }
        }

        return res;
    }
}

public class MergeTwoMaps{
    public static void main(String[] args){

        Map<String,Integer> m1=new HashMap<>();
        m1.put("A",1);
        m1.put("B",2);

        Map<String,Integer> m2=new HashMap<>();
        m2.put("B",3);
        m2.put("C",4);

        System.out.println(MergeUtil.mergeMaps(m1,m2));
    }
}