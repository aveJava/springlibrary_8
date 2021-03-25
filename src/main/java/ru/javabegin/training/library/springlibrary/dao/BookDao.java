package ru.javabegin.training.library.springlibrary.dao;

import ru.javabegin.training.library.springlibrary.domain.Book;

import java.util.List;

public interface BookDao {
    List<Book> getAll();
    Book get();
    Book save(Book book);
    void delete(Book book);

    List<Book> search(String ... searchString);

    List<Book> findTopBooks(int limit);
}
