package org.example;

public class Book {
    private String title;
    private int numberOfPages;
    private int publicationYear;

    // Constructor
    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for number of pages
    public int getNumberOfPages() {
        return numberOfPages;
    }

    // Getter for publication year
    public int getPublicationYear() {
        return publicationYear;
    }

    // Override toString() method to print book details
    @Override
    public String toString() {
        return "Title: " + getTitle() + ", Pages: " + getNumberOfPages() + ", Year: " + getPublicationYear();
    }
}