package com.bao.booksellerdemo.controller;

import com.bao.booksellerdemo.entity.Book;
import com.bao.booksellerdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/book")
    public List<Book> getAllBook() {
        return bookService.getAllBooks();
    }

    @GetMapping("/book/{id}")
    public Book findById(@PathVariable String id) {
        return bookService.getBookById(id);
    }

    @PostMapping("/book")
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @PutMapping("/book/{id}")
    public Book updateBook(@PathVariable String id, @RequestBody Book book) {
        return bookService.updateBook(id, book);
    }

    @DeleteMapping("/book/{id}")
    public void deleteBook(@PathVariable String id) {
        Book book = bookService.getBookById(id);
        bookService.deleteBook(book);
    }

}
