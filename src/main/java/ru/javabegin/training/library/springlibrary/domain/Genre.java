package ru.javabegin.training.library.springlibrary.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long Id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "genre", fetch = FetchType.LAZY)
    private List<Book> books;

    @Override
    public String toString() {
        return name;
    }
}