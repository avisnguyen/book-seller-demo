package com.bao.booksellerdemo.repository;

import com.bao.booksellerdemo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {

}
