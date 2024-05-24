package br.com.moon.springwebapp.spring.repository;

import br.com.moon.springwebapp.spring.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
