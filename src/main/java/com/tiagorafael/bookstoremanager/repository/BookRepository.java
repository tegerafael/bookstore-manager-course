package com.tiagorafael.bookstoremanager.repository;

import com.tiagorafael.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
