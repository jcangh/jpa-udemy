package com.jca.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {

	private long id;
	
	private String name;
	
	private String author;

	public Book(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	
}
