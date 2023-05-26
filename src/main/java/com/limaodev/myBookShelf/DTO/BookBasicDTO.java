package com.limaodev.myBookShelf.DTO;

import java.util.List;

import com.limaodev.myBookShelf.entities.Book;
import com.limaodev.myBookShelf.entities.Genre;
import com.limaodev.myBookShelf.projections.BookBasicProjection;

import lombok.Getter;

@Getter
public class BookBasicDTO {
    
    private Long id;
    private String title;
    private String author;
    private Integer year;
    private String synopsis;
    private String coverUrl;
    private List<Genre> genres;

    public BookBasicDTO(){}

    public BookBasicDTO(Book entity) {
        id = entity.getId();
        title = entity.getTitle();
        author = entity.getAuthor();
        year = entity.getYear();
        synopsis = entity.getSynopsis();
        coverUrl = entity.getCoverUrl();
        genres = entity.getGenres();
    }

    public BookBasicDTO(BookBasicProjection book) {
        id = book.getBId();
        title = book.getTitle();
        author = book.getAuthor();
        year = book.getYearPub();
        synopsis = book.getSynopsis();
        coverUrl = book.getCoverUrl();
        genres = getGenres();
    }

}
