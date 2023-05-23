package com.limaodev.myBookShelf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.limaodev.myBookShelf.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
    
}
