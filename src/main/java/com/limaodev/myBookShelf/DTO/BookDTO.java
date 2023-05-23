package com.limaodev.myBookShelf.DTO;

import org.springframework.beans.BeanUtils;

import com.limaodev.myBookShelf.entities.Book;

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
    private String description;
    private String coverUrl;

    public BookDTO(){
    }

    public BookDTO(Book entity) {
     BeanUtils.copyProperties(entity, this);
    }

}
