package com.limaodev.myBookShelf.DTO;

import org.springframework.beans.BeanUtils;

import com.limaodev.myBookShelf.entities.Genre;
import com.limaodev.myBookShelf.projections.GenreProjection;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenreDTO {

    private Long id;
    private String name;

    public GenreDTO() {
    }

    public GenreDTO(Genre entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public GenreDTO(GenreProjection entity) {
        BeanUtils.copyProperties(entity, this);
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
        GenreDTO other = (GenreDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
