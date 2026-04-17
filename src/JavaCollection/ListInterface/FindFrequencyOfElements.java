package JavaCollection;
import java.util.*;
class FrequencyUtil{
    static Map<String,Integer> findFrequency(List<String> list){
        Map<String,Integer> map=new HashMap<>();
        for(String s:list){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }
        return map;
    }
}
public class FindFrequencyOfElements{
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        System.out.println(FrequencyUtil.findFrequency(list));
    }
}