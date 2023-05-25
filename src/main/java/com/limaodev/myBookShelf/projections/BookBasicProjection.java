package com.limaodev.myBookShelf.projections;

public interface BookBasicProjection {
    
    Long getBId();
    String getTitle();
    String getAuthor();
    Integer getYearPub();
    String getSynopsis();
    String getCoverUrl();
}