package br.com.moon.springwebapp.spring.bootstrap;

import br.com.moon.springwebapp.spring.domain.Author;
import br.com.moon.springwebapp.spring.domain.Book;
import br.com.moon.springwebapp.spring.domain.Publisher;
import br.com.moon.springwebapp.spring.repository.AuthorRepository;
import br.com.moon.springwebapp.spring.repository.BookRepository;
import br.com.moon.springwebapp.spring.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher publisher = new Publisher("Papa Joao Paulo I", "São Paulo", "SP", "12231710");

        Author eric = new Author("eric", "evans");
        Book ddd = new Book("Domain Driven Design", "1234556");

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        publisherRepository.save(publisher);
        authorRepository.save(eric);
        bookRepository.save(ddd);


        System.out.println("Started Bootstrap...");
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Publisher: " + publisherRepository.count());
        System.out.println("Author: " + authorRepository.count());
    }
}
