package org.softwire.training.bookish.models.database;

public class Book {
    private int Id;
    private String bookName;
    private int AuthorId;
    private long ISBN;
    private int NumberOfCopies;

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        this.Id = id;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getAuthorID() {
        return AuthorId;
    }
    public void setAuthorID(int authorID) {
        this.AuthorId = authorID;
    }

    public long getISBN() {
        return ISBN;
    }
    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumberOfCopies() {
        return NumberOfCopies;
    }
    public void setNumberOfCopies(int numberOfCopies) {
        this.NumberOfCopies = numberOfCopies;
    }
}
