package src.com.gla.Scenario-Based-Problems;

class Book {
    int bookId;
    String title;
    double price;
    static String libraryName = "City Library";

    Book(int id, String title, double price) {
        this.bookId = id;
        this.title = title;
        this.price = price;
    }

    double calculateFine(int daysLate) {
        return 0;
    }
}

class TextBook extends Book {
    TextBook(int id, String title, double price) {
        super(id, title, price);
    }

    double calculateFine(int daysLate) {
        return daysLate * 2;
    }
}

class Magazine extends Book {
    Magazine(int id, String title, double price) {
        super(id, title, price);
    }

    double calculateFine(int daysLate) {
        return daysLate * 5;
    }
}

public class SmartLibrarySystem {
    public static void main(String[] args) {
        Book b;

        b = new TextBook(1,"Java Basics",300);
        System.out.println("Fine: " + b.calculateFine(3));

        b = new Magazine(2,"Tech Monthly",150);
        System.out.println("Fine: " + b.calculateFine(3));
    }
}
