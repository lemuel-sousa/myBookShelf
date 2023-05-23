package com.limaodev.myBookShelf.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.limaodev.myBookShelf.DTO.BookDTO;
import com.limaodev.myBookShelf.services.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
    
    @Autowired
    private BookService bookService;

    //Get books
    @GetMapping()
    public List<BookDTO> getBooks(){
        return bookService.findAll();
    }

}
