package com.limaodev.myBookShelf.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.limaodev.myBookShelf.DTO.GenreDTO;
import com.limaodev.myBookShelf.services.GenreService;

@RestController
@RequestMapping("/genres")
public class GenreController {
    
    @Autowired
    public GenreService genreService;

    //Get genres
    @GetMapping
    public List<GenreDTO> getGenres(){
        return genreService.findAll();
    }


}
