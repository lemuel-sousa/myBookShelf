package com.limaodev.myBookShelf.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.limaodev.myBookShelf.entities.Genre;
import com.limaodev.myBookShelf.projections.GenreProjection;

public interface GenreRepository extends JpaRepository<Genre, Long> {

    @Query(nativeQuery = true, value = """
            SELECT g.id, g.name
            FROM genres g
            JOIN book_genre bg ON g.id = bg.genre_id
            JOIN books b ON b.id = bg.book_id
            WHERE bg.book_id = :bookId
                """)
    public List<GenreProjection> findByBook(@Param("bookId") Long bookId);
}
