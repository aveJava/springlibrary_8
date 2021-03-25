package ru.javabegin.training.library.springlibrary.dao;

import ru.javabegin.training.library.springlibrary.domain.Genre;

import java.util.List;

public interface GenreDao {
    List<Genre> getAll();
    Genre get(long id);
    Genre save(Genre genre);
    void delete(Genre genre);
}
