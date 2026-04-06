package scr.com.gla.Wrapper Class;

import java.util.*;

public class EmployeeAges {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        ArrayList<Integer> list = new ArrayList<>();

        for(int x:arr) list.add(x);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
    }
}
