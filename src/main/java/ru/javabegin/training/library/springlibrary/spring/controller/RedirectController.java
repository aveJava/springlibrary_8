package ru.javabegin.training.library.springlibrary.spring.controller;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.javabegin.training.library.springlibrary.domain.Author;
import ru.javabegin.training.library.springlibrary.domain.Book;
import ru.javabegin.training.library.springlibrary.spring.repository.AuthorRepository;
import ru.javabegin.training.library.springlibrary.spring.repository.BookRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@Log    // автоматически создает переменную log и позволяет к ней обращаться в коде
public class RedirectController {
    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    // при запуске проекта первый запрос попадает сюда
    @GetMapping
    public String baseUrlRedirect(HttpServletRequest request, HttpServletResponse response) {
        // List<Author> authors = authorRepository.findAll();
        List<Book> books = bookRepository.findByNameContainingIgnoreCaseOrAuthorFioContainingIgnoreCaseOrderByName("пр", "ав");
        return "ok";
    }
}
