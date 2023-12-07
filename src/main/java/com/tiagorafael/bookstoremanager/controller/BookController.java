package com.tiagorafael.bookstoremanager.controller;

import com.tiagorafael.bookstoremanager.dto.MessageResponseDTO;
import com.tiagorafael.bookstoremanager.entity.Book;
import com.tiagorafael.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BookRepository bookRespository;

    @Autowired
    public BookController(BookRepository bookRespository) {
        this.bookRespository = bookRespository;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book) {
        Book savedBook = bookRespository.save(book);
        return MessageResponseDTO.builder()
                .message("Book create with ID " + savedBook.getId())
                .build();
    }
}
