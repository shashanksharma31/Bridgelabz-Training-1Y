package src.com.gla.Lambda_Expressions;
import java.util.*;
import java.util.function.*;

class Invoice {
    int id;
    Invoice(int id){this.id=id;}
}

public class InvoiceCreation {
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(1,2,3);

        Function<Integer,Invoice> creator = Invoice::new;

        for(int id:ids){
            Invoice i = creator.apply(id);
            System.out.println("Invoice created: "+i.id);
        }
    }
}
