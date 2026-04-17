package JavaCollection.ScenarioBased;
import java.util.*;

class Book{
    int id;
    String name;

    Book(int id,String name){
        this.id=id;
        this.name=name;
    }

    public String toString(){
        return id+" "+name;
    }
}

public class LibraryManagementSystem{
    public static void main(String[] args){

        List<Book> books=new ArrayList<>();
        books.add(new Book(1,"Java"));
        books.add(new Book(2,"DBMS"));
        books.add(new Book(3,"OS"));

        Set<String> members=new HashSet<>();
        members.add("M1");
        members.add("M2");
        members.add("M1");

        Queue<Book> issueQueue=new LinkedList<>();
        Stack<Book> returned=new Stack<>();

        issueQueue.add(books.get(0));
        issueQueue.add(books.get(1));

        System.out.println("Issuing Books:");
        while(!issueQueue.isEmpty()){
            Book b=issueQueue.remove();
            System.out.println("Issued: "+b);
            returned.push(b);
        }

        if(!returned.isEmpty()){
            Book b=returned.pop();
            System.out.println("Re-issuing: "+b);
            issueQueue.add(b);
        }

        System.out.println("\nMembers:");
        for(String m:members){
            System.out.println(m);
        }

        System.out.println("\nLibrary Books:");
        for(Book b:books){
            System.out.println(b);
        }
    }
}