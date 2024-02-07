package com.kristjan.springbootlibrary.entity;

import lombok.Data;
import jakarta.persistence.*;   //jakarta - javax asemel

@Entity
@Table(name = "book")  //same table at MYSQL database
@Data  //for lombok to generate getters and setters
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "author")
	private String author;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "copies")
	private int copies;
	
	@Column(name = "copies_available")
	private int copiesAvailable;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "img")
	private String img;
}
