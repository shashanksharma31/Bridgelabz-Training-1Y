package MapInterface;
import java.util.*;

public class LibraryBookCatalog{
    public static void main(String[] args){

        Map<String,String> books=new HashMap<>();

        books.put("978-1111111111","Java Basics");
        books.put("978-2222222222","Data Structures");
        books.put("978-3333333333","Operating Systems");
        books.put("978-4444444444","DBMS");

        String searchIsbn="978-2222222222";

        if(books.containsKey(searchIsbn)){
            System.out.println("Found: "+books.get(searchIsbn));
        }else{
            System.out.println("Book not found");
        }

        books.remove("978-3333333333");

        Map<String,String> sorted=new TreeMap<>(books);

        System.out.println("\nSorted Catalog:");
        for(String isbn:sorted.keySet()){
            System.out.println(isbn+" "+sorted.get(isbn));
        }

        String searchTitle="Java Basics";
        System.out.println("\nSearch by Title:");
        boolean found=false;

        for(String isbn:books.keySet()){
            if(books.get(isbn).equals(searchTitle)){
                System.out.println(isbn+" "+books.get(isbn));
                found=true;
            }
        }

        if(!found){
            System.out.println("Book not found");
        }
    }
}