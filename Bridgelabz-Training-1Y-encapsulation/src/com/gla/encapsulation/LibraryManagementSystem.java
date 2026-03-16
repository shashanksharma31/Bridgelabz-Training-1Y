package com.gla.encapsulation;


interface Reservable {
    void reserveItem();
}

abstract class LibraryItem {
    private int itemId;
    private String title;

    public LibraryItem(int id, String title) {
        this.itemId = id;
        this.title = title;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Title: " + title);
    }
}

class Book extends LibraryItem implements Reservable {
    public Book(int id, String title) {
        super(id, title);
    }
    public int getLoanDuration() { return 14; }
    public void reserveItem() {
        System.out.println("Book Reserved");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem item = new Book(1, "Java");
        item.getItemDetails();
        System.out.println("Loan Days: " + item.getLoanDuration());
    }
}
