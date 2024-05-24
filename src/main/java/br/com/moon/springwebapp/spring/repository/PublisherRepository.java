package br.com.moon.springwebapp.spring.repository;

import br.com.moon.springwebapp.spring.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
