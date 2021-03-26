package ru.javabegin.training.library.springlibrary.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javabegin.training.library.springlibrary.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
