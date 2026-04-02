package src.com.gla.classes-objects.package-assignment;


// Program 5: Library management example
class Book{
    String title = "Java Basics";
}

class Member{
    String name = "Aman";
}

class Transaction{
    void issueBook(){
        System.out.println("Book issued to member");
    }
}

public class LibraryManagementSystem{
    public static void main(String[] args){

        Book b = new Book();
        Member m = new Member();
        Transaction t = new Transaction();

        System.out.println("Book: " + b.title);
        System.out.println("Member: " + m.name);
        t.issueBook();
    }
}
