package com.reader.readingList.controller;

import com.reader.readingList.model.Book;
import com.reader.readingList.service.IBookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    private IBookService bookService;

    BookController(IBookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    Book getBookById(@PathVariable int id) {
        return bookService.getBookById(id);
    }

    @DeleteMapping("/books/{id}")
    void deleteBookById(@PathVariable int id) {
        bookService.deleteBookById(id);
    }

    @PostMapping("/books")
    void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @PutMapping("/books/{id}")
    void updateBook(@PathVariable int id, @RequestBody Book book) {
        bookService.updateBookInfo(id, book);
    }



}
