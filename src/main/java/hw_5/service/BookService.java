package hw_5.service;


import hw_5.entity.Book;
import hw_5.exception.BookNotFoundException;
import hw_5.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public Book getBookById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book not found"));
    }

    public Book createBook(Book book) {
        return repository.save(book);
    }

}