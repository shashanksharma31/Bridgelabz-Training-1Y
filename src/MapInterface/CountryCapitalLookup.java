package MapInterface;
import java.util.*;

public class CountryCapitalLookup{
    public static void main(String[] args){

        Map<String,String> map=new HashMap<>();

        map.put("India","New Delhi");
        map.put("Japan","Tokyo");
        map.put("USA","Washington DC");
        map.put("France","Paris");
        map.put("Germany","Berlin");
        map.put("Italy","Rome");
        map.put("Canada","Ottawa");
        map.put("Australia","Canberra");

        String country="Japan";

        if(map.containsKey(country)){
            System.out.println(map.get(country));
        }else{
            System.out.println("Unknown country");
        }

        Map<String,String> sorted=new TreeMap<>(map);

        System.out.println("\nSorted List:");
        for(String c:sorted.keySet()){
            System.out.println(c+" "+sorted.get(c));
        }
    }
}