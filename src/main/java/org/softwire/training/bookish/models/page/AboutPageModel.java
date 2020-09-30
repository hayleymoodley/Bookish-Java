package org.softwire.training.bookish.models.page;

import org.softwire.training.bookish.models.database.Book;
import org.softwire.training.bookish.models.database.Technology;

import java.util.List;

public class AboutPageModel {
    private List<Book> Books;

    public List<Book> getBooks() {
        return Books;
    }
    public void setBooks(List<Book> Books) {
        this.Books = Books;
    }
}
