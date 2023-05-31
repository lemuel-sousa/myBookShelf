package com.limaodev.myBookShelf.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.limaodev.myBookShelf.DTO.BookBasicDTO;
import com.limaodev.myBookShelf.DTO.GenreDTO;
import com.limaodev.myBookShelf.services.BookService;
import com.limaodev.myBookShelf.services.GenreService;

@RestController
@RequestMapping("/books")
public class BookController {
    
    @Autowired
    private BookService bookService;
    @Autowired
    private GenreService genreService;

    //Get books
    @GetMapping()
    public List<BookBasicDTO> getBooks(){
        return bookService.findAll();
    }

    //Get book by id
    @GetMapping("/{id}")
    public Optional<Object> getById(Long id) {
        return bookService.findById(id);
    }

    //Get genres by book
    @GetMapping("/{bookId}/genres")
    public List<GenreDTO> getGenresByBook(@PathVariable("bookId") Long bookId){
        return genreService.findGenresByBook(bookId);
    }

}
