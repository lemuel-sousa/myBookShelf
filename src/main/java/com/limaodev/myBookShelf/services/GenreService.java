package com.limaodev.myBookShelf.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.limaodev.myBookShelf.DTO.GenreDTO;
import com.limaodev.myBookShelf.entities.Genre;
import com.limaodev.myBookShelf.repositories.GenreRepository;

@Service
public class GenreService {
    
    @Autowired
    public GenreRepository genreRepository;

    //Find genres
    @Transactional
    public List<GenreDTO> findAll(){
        List<Genre> genres = genreRepository.findAll();
        return genres.stream().map( e -> new GenreDTO(e)).toList();
    }



}
