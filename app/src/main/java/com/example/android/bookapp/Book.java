package com.example.android.bookapp;

public class Book {
    private String title;
    private String author;
   // private String description;

    public Book(String title,String author) {
        this.title = title;
        //this.description = description;
        this.author=author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    /*public String getDescription() {
        return description;
    }*/
}
