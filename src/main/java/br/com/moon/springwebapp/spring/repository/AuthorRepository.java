package br.com.moon.springwebapp.spring.repository;

import br.com.moon.springwebapp.spring.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
