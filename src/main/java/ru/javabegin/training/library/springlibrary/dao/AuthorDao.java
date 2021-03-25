package ru.javabegin.training.library.springlibrary.dao;

import ru.javabegin.training.library.springlibrary.domain.Author;
import ru.javabegin.training.library.springlibrary.domain.Book;
import ru.javabegin.training.library.springlibrary.domain.Genre;
import ru.javabegin.training.library.springlibrary.domain.Vote;

import java.util.List;

public interface AuthorDao {
    List<Author> getAll();          // получить всех авторов
    Author get(long id);            // плолучить автора по id
    Author save (Author obj);        // сохранить автора (и для добавления и для редактирования)
    void delete(Author object);     // удалить автора

    List<Author> search(String ... searchString);
}
