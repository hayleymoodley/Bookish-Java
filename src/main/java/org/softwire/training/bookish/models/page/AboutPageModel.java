package org.softwire.training.bookish.models.page;

import org.softwire.training.bookish.models.database.Book;

import java.util.List;

public class AboutPageModel {
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> Books) {
        this.books = Books;
    }
}
