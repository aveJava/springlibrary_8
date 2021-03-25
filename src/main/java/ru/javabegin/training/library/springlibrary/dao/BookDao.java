package ru.javabegin.training.library.springlibrary.dao;

import ru.javabegin.training.library.springlibrary.domain.Book;

import java.util.List;

public interface BookDao extends GeneralDAO<Book> {
    List<Book> findTopBooks(int limit);
}
