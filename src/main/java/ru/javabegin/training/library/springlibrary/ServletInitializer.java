package ru.javabegin.training.library.springlibrary;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * С помощью данного класса создается Spring-проект типа Web.
 * При дапуске данного класса считываются настройки из файла application.yml (также может испрользовать application.property).
 */

@SpringBootApplication
// @EnableAspectJAutoProxy     // включаем использование AspectJ
@ComponentScan(basePackages = {"ru.javabegin.training.library.springlibrary"})	// в каком пакете искать классы бинов (по умолчанию поиск осуществляется в пакете данного класса (@SpringBootApplication))
public class ServletInitializer extends SpringBootServletInitializer {		// наследование от данного класса делается чтобы запустились механизмы SpringMVC

}
