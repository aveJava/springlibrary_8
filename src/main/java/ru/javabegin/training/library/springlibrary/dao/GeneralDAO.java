package ru.javabegin.training.library.springlibrary.dao;

import ru.javabegin.training.library.springlibrary.domain.Author;

import java.util.List;

public interface GeneralDAO<T> {
    List<T> getAll();               // получить все объекты (например, всех авторов для класса Author)
    T get(long id);                 // плолучить объект по id (например, автора по его id для класса Author)
    T save (Author obj);            // сохранить объект в БД (и для добавления и для редактирования)
    void delete(Author object);     // удалить объект

    List<T> search(String ... searchString);    // производит поиск объектов класса по ключевым словам
}
