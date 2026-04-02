package src.com.gla.classes-variables.Level1;


// Program 5: Library book borrow example
public class LibraryBookSystem {

    String title;
    String author;
    double price;
    boolean available=true;

    LibraryBookSystem(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    void borrowBook(){
        if(available){
            available=false;
            System.out.println("Book borrowed successfully");
        }else{
            System.out.println("Book not available");
        }
    }

    public static void main(String[] args){
        LibraryBookSystem b=new LibraryBookSystem("Java","James",400);
        b.borrowBook();
    }
}
