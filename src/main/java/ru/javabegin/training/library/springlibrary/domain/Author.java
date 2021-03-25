package ru.javabegin.training.library.springlibrary.domain;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "author", catalog = "library")
@EqualsAndHashCode(of = "id")   // hashcode будет вычисляться только на основе поля id
@DynamicUpdate      // при обновлении объекта класса PreparedStatement будет включать только столбцы, значения которых были изменены (а не все)
@Getter @Setter
@DynamicInsert      // при сохранении нового объекта в БД PreparedStatement будет включать только ненулевые столбцы
@SelectBeforeUpdate // получает объект из БД перед обновлением, проверяет действительно ли он изменился и обновляет только если он действительно изменился
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String fio;

    private Date birthday;

    @Basic(fetch = FetchType.LAZY)
    @OneToMany(mappedBy = "author") // author - имя поля в классе Book
    private List<Book> books;

    @Override
    public String toString() {
        return fio;
    }
}
