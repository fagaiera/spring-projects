package com.fabiogaiera.scalar.service;

import com.fabiogaiera.scalar.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookService {

    @Autowired
    private Book book;

    public void printBook() {
        System.out.println(book);
    }

}