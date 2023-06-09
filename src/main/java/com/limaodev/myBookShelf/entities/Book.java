package com.limaodev.myBookShelf.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table( name = "books")
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;


    private String title;
    private String author;
    @Column( name = "year_pub")
    private Integer year;

    @Column(columnDefinition = "TEXT")
    private String synopsis;
    
    @Column(columnDefinition = "TEXT")
    private String description;
    private String coverUrl;

    @ManyToMany( fetch = FetchType.EAGER)
    @JoinTable(
        name = "book_genre",
        joinColumns = @JoinColumn( name = "book_id"),
        inverseJoinColumns = @JoinColumn( name = "genre_id")
        
    )
    private List<Genre> genres;


    public Book(){
    }

    public Book(Long id, String title, String author, Integer year, String synopsis, String description,
            String coverUrl) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.synopsis = synopsis;
        this.description = description;
        this.coverUrl = coverUrl;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    

}
