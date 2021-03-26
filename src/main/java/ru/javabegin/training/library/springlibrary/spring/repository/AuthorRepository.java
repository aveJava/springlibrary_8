package ru.javabegin.training.library.springlibrary.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javabegin.training.library.springlibrary.domain.Author;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    // найти авторов, значение поля fio, которых содержит (в любом месте (начале, конце, середине)) переданную строку игнорирую раскладку, результаты отсортировать по значению поля fio
    List<Author> findByFioContainingIgnoreCaseOrderByFio(String fio);

}
