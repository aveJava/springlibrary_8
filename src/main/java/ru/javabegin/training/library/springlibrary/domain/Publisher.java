package ru.javabegin.training.library.springlibrary.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

    @Basic(fetch = FetchType.LAZY)
    @OneToMany(mappedBy = "publisher")  // publisher - имя поля в классе Book
    private List<Book> books;

    @Override
    public String toString() {
        return name;
    }
}
