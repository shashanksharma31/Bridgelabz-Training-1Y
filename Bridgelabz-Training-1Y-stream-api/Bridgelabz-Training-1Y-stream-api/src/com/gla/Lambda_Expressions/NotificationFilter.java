package src.com.gla.Lambda_Expressions;
import java.util.*;
import java.util.function.*;

public class NotificationFilter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Critical","Normal","Emergency");

        Predicate<String> filter = s -> s.equals("Critical");

        list.stream().filter(filter).forEach(System.out::println);
    }
}
