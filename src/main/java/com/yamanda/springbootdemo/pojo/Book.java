package com.yamanda.springbootdemo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "book")
public class Book {
    private String author;
    private Integer price;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Book() {
    }

    public Book(String author, Integer price) {
        this.author = author;
        this.price = price;
    }
}
