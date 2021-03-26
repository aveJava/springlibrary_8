package ru.javabegin.training.library.springlibrary.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javabegin.training.library.springlibrary.domain.Author;
import ru.javabegin.training.library.springlibrary.domain.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    // лист книг, для который найдено включение name в имени книги, или authorFio в имени автора книги
    // AuthorFioContaining... - поиск совпадения в поле fio объекта, находящегося в поле author кники
    List<Book> findByNameContainingIgnoreCaseOrAuthorFioContainingIgnoreCaseOrderByName(String name, String fio);

}
