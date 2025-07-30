package com.kristjan.springbootlibrary.response_models;

import com.kristjan.springbootlibrary.entity.Book;
import lombok.Data;

@Data
public class ShelfCurrentLoansResponse {

    public ShelfCurrentLoansResponse(Book book, int daysLeft) {
        this.book = book;
        this.daysLeft = daysLeft;
    }

    // Setting two properties
    private Book book;
    private int daysLeft;
}