package com.limaodev.myBookShelf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.limaodev.myBookShelf.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{
    
}
