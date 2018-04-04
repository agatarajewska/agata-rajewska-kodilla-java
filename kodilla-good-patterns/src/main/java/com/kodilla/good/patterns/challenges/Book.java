package com.kodilla.good.patterns.challenges;

import java.math.BigDecimal;

public class Book implements Product {

    private String author;
    private String title;
    private BigDecimal price;

    public Book(String author, String title, BigDecimal price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book {author='" + author + '\'' + ", title='" + title + '\'' + ", price=" + price + '}';
    }
}