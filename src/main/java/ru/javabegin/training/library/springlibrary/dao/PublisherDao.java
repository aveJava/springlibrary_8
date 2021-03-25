package ru.javabegin.training.library.springlibrary.dao;

import ru.javabegin.training.library.springlibrary.domain.Book;
import ru.javabegin.training.library.springlibrary.domain.Publisher;

import java.util.List;

public interface PublisherDao {
    List<Publisher> getAll();
    Publisher get(long id);
    Publisher save(Publisher publisher);
    void delete(Publisher publisher);


    List<Publisher> search(String ... searchString);
}
