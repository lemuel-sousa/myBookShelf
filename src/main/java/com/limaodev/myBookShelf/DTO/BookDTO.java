package com.limaodev.myBookShelf.DTO;

import java.util.List;

import org.springframework.beans.BeanUtils;

import com.limaodev.myBookShelf.entities.Book;
import com.limaodev.myBookShelf.entities.Genre;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDTO {
    
    private Long id;
    private String title;
    private String author;
    private Integer year;
    private String synopsis;
    private String coverUrl;
    private List<Genre> genres;

    public BookDTO(){
    }

    public BookDTO(Book entity) {
     BeanUtils.copyProperties(entity, this);
    }

}
