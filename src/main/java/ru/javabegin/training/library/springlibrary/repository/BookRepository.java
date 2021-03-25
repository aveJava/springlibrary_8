package ru.javabegin.training.library.springlibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javabegin.training.library.springlibrary.domain.Author;
import ru.javabegin.training.library.springlibrary.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
