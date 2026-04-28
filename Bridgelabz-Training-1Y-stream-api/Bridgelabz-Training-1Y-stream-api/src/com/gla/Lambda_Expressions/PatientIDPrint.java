package src.com.gla.Lambda_Expressions;
import java.util.*;

public class PatientIDPrint {
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(1,2,3);
        ids.forEach(System.out::println);
    }
}
