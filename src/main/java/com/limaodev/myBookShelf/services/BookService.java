package com.limaodev.myBookShelf.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.limaodev.myBookShelf.DTO.BookBasicDTO;
import com.limaodev.myBookShelf.entities.Book;
import com.limaodev.myBookShelf.projections.BookBasicProjection;
import com.limaodev.myBookShelf.repositories.BookRepository;


@Service
public class BookService {
    
    @Autowired
    private BookRepository bookRepository;

    //Find all books
    @Transactional( readOnly = true) 
    public List<BookBasicDTO> findAll(){
        List<Book> books = bookRepository.findAll();
        return books.stream().map( e -> new BookBasicDTO(e)).toList();
    }

    //Find book by id
    @Transactional( readOnly = true) 
    public Optional<Object> findById(Long id) {
        return bookRepository.findById(id)
                .map(e -> new BookBasicDTO(e));
    }

    //Find books by genre
    @Transactional( readOnly = true) 
    public List<BookBasicDTO> findBooksByGenre(Long genreId){
        List<BookBasicProjection> bookBasicProjections = bookRepository.findByGenre(genreId);
        return bookBasicProjections.stream().map( e -> new BookBasicDTO(e)).toList();
    }
}
