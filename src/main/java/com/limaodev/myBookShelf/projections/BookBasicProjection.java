package com.limaodev.myBookShelf.projections;

import java.util.List;

public interface BookBasicProjection {
    
    Long getBId();
    String getTitle();
    String getAuthor();
    Integer getYearPub();
    String getSynopsis();
    String getCoverUrl();
    List<GenreProjection> getGenres();
}