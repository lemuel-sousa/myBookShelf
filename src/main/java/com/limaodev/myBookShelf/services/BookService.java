package com.limaodev.myBookShelf.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.limaodev.myBookShelf.DTO.BookBasicDTO;
import com.limaodev.myBookShelf.entities.Book;
import com.limaodev.myBookShelf.repositories.BookRepository;

import jakarta.transaction.Transactional;

@Service
public class BookService {
    
    @Autowired
    private BookRepository bookRepository;

    //Find all books
    @Transactional
    public List<BookBasicDTO> findAll(){
        List<Book> books = bookRepository.findAll();
        return books.stream().map( e -> new BookBasicDTO(e)).toList();
    }
}
