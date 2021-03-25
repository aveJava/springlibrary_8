package ru.javabegin.training.library.springlibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javabegin.training.library.springlibrary.domain.Genre;

@Repository     // является Spring бином, отвечающим за создание репозитория
public interface GenreRepository extends JpaRepository<Genre, Long> {
}
