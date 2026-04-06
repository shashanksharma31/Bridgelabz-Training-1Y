package scr.com.gla.Wrapper Class;

import java.util.*;

public class AutoBoxingExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=10;i++) list.add(i);
        int sum = 0;
        for(int x:list) sum += x;
        System.out.println(sum);
    }
}
