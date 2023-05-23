package com.limaodev.myBookShelf.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.limaodev.myBookShelf.DTO.BookDTO;
import com.limaodev.myBookShelf.entities.Book;
import com.limaodev.myBookShelf.repositories.BookRepository;

@Service
public class BookService {
    
    @Autowired
    private BookRepository bookRepository;

    //Find all books
    public List<BookDTO> findAll(){
        List<Book> books = bookRepository.findAll();

        return books.stream().map( e -> new BookDTO(e)).toList();
    }
}
