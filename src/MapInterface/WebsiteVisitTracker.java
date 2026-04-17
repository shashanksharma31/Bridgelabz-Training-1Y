package MapInterface;
import java.util.*;

public class WebsiteVisitTracker{
    public static void main(String[] args){

        Map<String,Integer> map=new HashMap<>();

        String[] visits={
                "home","about","products","home","products",
                "contact","home","products","home","about"
        };

        for(String page:visits){
            if(map.containsKey(page)){
                map.put(page,map.get(page)+1);
            }else{
                map.put(page,1);
            }
        }

        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());

        Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){
            public int compare(Map.Entry<String,Integer> a,Map.Entry<String,Integer> b){
                return b.getValue()-a.getValue();
            }
        });

        System.out.println("Pages by popularity:");
        for(Map.Entry<String,Integer> e:list){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        System.out.println("\nMost visited page:");
        System.out.println(list.get(0).getKey()+" "+list.get(0).getValue());
    }
}