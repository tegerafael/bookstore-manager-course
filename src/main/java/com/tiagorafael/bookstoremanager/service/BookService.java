package com.tiagorafael.bookstoremanager.service;

import com.tiagorafael.bookstoremanager.dto.MessageResponseDTO;
import com.tiagorafael.bookstoremanager.entity.Book;
import com.tiagorafael.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRespository;

    @Autowired
    public BookService(BookRepository bookRespository) {
        this.bookRespository = bookRespository;
    }

    public MessageResponseDTO create(Book book) {
        Book savedBook = bookRespository.save(book);
        return MessageResponseDTO.builder()
                .message("Book create with ID " + savedBook.getId())
                .build();
    }
}
