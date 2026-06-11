package com.library;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book(101, "Java Basics", "James Gosling"));
        library.addBook(new Book(102, "Spring Boot", "Rod Johnson"));
        library.addBook(new Book(103, "Maven Essentials", "John Doe"));

        System.out.println("\nAvailable Books:");
        library.displayBooks();

        System.out.println("\nIssuing Book ID 102");
        library.issueBook(102);

        System.out.println("\nBooks After Issue:");
        library.displayBooks();

        System.out.println("\nReturning Book ID 102");
        library.returnBook(102);

        System.out.println("\nBooks After Return:");
        library.displayBooks();
    }
}