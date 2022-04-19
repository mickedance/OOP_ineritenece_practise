package org.example.additionalFeaturesOfInheritance;

import javax.swing.*;

public class Book {
    private String title;
    private String author;
    private Category category;
    private int year;
    private int pages;

    public Book() {
        setPages(1000);
    }

    public Book(int pages) {
        setPages(pages);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
