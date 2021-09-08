package com.reader.readingList.service;

import com.reader.readingList.model.Book;

import java.util.List;

public interface IBookService {

    void addBook(final Book book);

    List<Book> getAllBooks();

    Book getBookById(final int id);

    void updateBookInfo(final int id, final Book book);

    void deleteBookById(final int id);
}
