package MapInterface;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter{
    public static void main(String[] args){

        String text="Hello world, hello Java!";

        text=text.toLowerCase();
        text=text.replaceAll("[^a-z ]","");

        String[] words=text.split(" ");

        Map<String,Integer> map=new HashMap<>();

        for(String w:words){
            if(w.length()==0){
                continue;
            }
            if(map.containsKey(w)){
                map.put(w,map.get(w)+1);
            }else{
                map.put(w,1);
            }
        }

        System.out.println(map);
    }
}