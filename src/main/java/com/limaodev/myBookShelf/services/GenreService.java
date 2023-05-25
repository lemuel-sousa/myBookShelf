package com.limaodev.myBookShelf.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.limaodev.myBookShelf.DTO.GenreDTO;
import com.limaodev.myBookShelf.entities.Genre;
import com.limaodev.myBookShelf.projections.GenreProjection;
import com.limaodev.myBookShelf.repositories.BookRepository;
import com.limaodev.myBookShelf.repositories.GenreRepository;

@Service
public class GenreService {
    
    @Autowired
    public GenreRepository genreRepository;
    public BookRepository bookRepository;

    //Find genres
    @Transactional( readOnly = true) 
    public List<GenreDTO> findAll(){
        List<Genre> genres = genreRepository.findAll();
        return genres.stream().map( e -> new GenreDTO(e)).toList();
    }

    //Find genres by book
    @Transactional( readOnly = true) 
    public List<GenreDTO> findGenresByBook(Long bookId){
        List<GenreProjection> genres = genreRepository.findByBook(bookId);

        return genres.stream().map( e -> new GenreDTO(e)).toList();
    }

}
