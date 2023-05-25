package com.limaodev.myBookShelf.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.limaodev.myBookShelf.entities.Book;
import com.limaodev.myBookShelf.projections.BookBasicProjection;

public interface BookRepository extends JpaRepository<Book, Long>{
    

    @Query( nativeQuery = true, value = """
        SELECT b.id AS bId, b.title, b.author, b.year_pub AS yearPub, b.synopsis, b.cover_url AS coverUrl
        FROM books AS b
        JOIN book_genre AS bg ON b.id = bg.book_id
        JOIN genres AS g ON g.id = bg.genre_id
        WHERE bg.genre_id = :genreId
        
            """)
    List<BookBasicProjection> findByGenre(@Param("genreId") Long genreId);

}
