package src.com.gla.Lambda_Expressions;
import java.util.*;

public class UppercaseNames {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("rahul","amit");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
