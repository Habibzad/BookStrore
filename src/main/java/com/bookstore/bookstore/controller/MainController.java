package com.bookstore.bookstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.bookstore.model.Book;

@RestController
public class MainController {
	
	@GetMapping("/book")
	public Book getBook() {
		return new Book(1, "Intro to Spring Boot");
	}
}
