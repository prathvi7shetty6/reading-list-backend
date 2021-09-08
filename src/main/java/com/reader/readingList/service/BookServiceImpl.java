package com.reader.readingList.service;

import com.reader.readingList.model.Book;
import com.reader.readingList.model.Review;
import com.reader.readingList.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements  IBookService{

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void addBook(Book book) {
        Review r = book.getReview();
        bookRepository.saveAndFlush(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(int id) {
        return bookRepository.getById(id);
    }

    @Override
    public void updateBookInfo(int id, Book book) {
        Book bookData = bookRepository.getById(id);
        bookData.setTitle(book.getTitle());
        bookData.setAuthor(book.getAuthor());
        bookData.setRating(book.getRating());
        bookData.setReview(book.getReview());
        bookRepository.saveAndFlush(bookData);
    }

    @Override
    public void deleteBookById(int id) {
        bookRepository.deleteById(id);
    }
}
