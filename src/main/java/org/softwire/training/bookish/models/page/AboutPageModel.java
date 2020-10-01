package org.softwire.training.bookish.models.page;

import org.softwire.training.bookish.models.database.Author;
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

    private List<Author> authors;

    public List<Author> getAuthors() {
        return authors;
    }
    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

}
