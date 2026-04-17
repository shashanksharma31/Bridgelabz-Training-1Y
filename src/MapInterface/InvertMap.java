package MapInterface;
import java.util.*;

class InvertUtil{
    static <K,V> Map<V,List<K>> invertMap(Map<K,V> map){
        Map<V,List<K>> res=new HashMap<>();

        for(K key:map.keySet()){
            V val=map.get(key);

            if(!res.containsKey(val)){
                res.put(val,new ArrayList<>());
            }

            res.get(val).add(key);
        }

        return res;
    }
}

public class InvertMap{
    public static void main(String[] args){

        Map<String,Integer> map=new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",1);

        System.out.println(InvertUtil.invertMap(map));
    }
}