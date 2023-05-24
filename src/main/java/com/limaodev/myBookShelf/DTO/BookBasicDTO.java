package com.limaodev.myBookShelf.DTO;

import com.limaodev.myBookShelf.entities.Book;

import lombok.Getter;

@Getter
public class BookBasicDTO {
    
    private Long id;
    private String title;
    private String author;
    private Integer year;
    private String synopsis;
    private String coverUrl;

    public BookBasicDTO(){}

    public BookBasicDTO(Book entity) {
        id = entity.getId();
        title = entity.getTitle();
        author = entity.getAuthor();
        year = entity.getYear();
        synopsis = entity.getSynopsis();
        coverUrl = entity.getCoverUrl();
    }

}
