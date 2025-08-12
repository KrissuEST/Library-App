package com.kristjan.springbootlibrary.request_models;

import lombok.Data;

@Data
public class AddBookRequest {   // For adding new book

    private String title;

    private String author;

    private String description;

    private int copies;

    private String category;

    private String img;
}