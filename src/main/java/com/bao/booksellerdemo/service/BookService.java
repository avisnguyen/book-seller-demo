package com.bao.booksellerdemo.service;

import com.bao.booksellerdemo.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    Book getBookById(String id);

    Book addBook(Book book);

    Book updateBook(String id, Book book);

    void deleteBook(Book book);
}
