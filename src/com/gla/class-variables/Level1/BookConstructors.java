package src.com.gla.classes-variables.Level1;


// Program 1: Book class with default and parameterized constructors
public class BookConstructors {

    String title;
    String author;
    double price;

    // Default constructor
    BookConstructors(){
        title="Unknown";
        author="Unknown";
        price=0;
    }

    // Parameterized constructor
    BookConstructors(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }

    public static void main(String[] args){
        BookConstructors b1=new BookConstructors();
        BookConstructors b2=new BookConstructors("Java Basics","James",500);

        b1.display();
        System.out.println("----");
        b2.display();
    }
}
