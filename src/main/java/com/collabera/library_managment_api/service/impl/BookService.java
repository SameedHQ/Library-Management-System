package com.collabera.library_managment_api.service.impl;

import com.collabera.library_managment_api.dto.BookDTO;

import java.util.List;

public interface BookService {
    BookDTO registerBook(BookDTO bookDTO);
    List<BookDTO> getAllBooks();

    BookDTO getBookById(Long bookId);
}
