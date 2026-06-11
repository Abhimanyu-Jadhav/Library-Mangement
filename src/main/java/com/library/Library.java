package com.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book Added Successfully");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        books.forEach(System.out::println);
    }

    public Book searchBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public void issueBook(int id) {
        Book book = searchBook(id);

        if (book != null && !book.isIssued()) {
            book.issueBook();
            System.out.println("Book Issued Successfully");
        } else {
            System.out.println("Book Not Available");
        }
    }

    public void returnBook(int id) {
        Book book = searchBook(id);

        if (book != null && book.isIssued()) {
            book.returnBook();
            System.out.println("Book Returned Successfully");
        } else {
            System.out.println("Invalid Return Request");
        }
    }
}