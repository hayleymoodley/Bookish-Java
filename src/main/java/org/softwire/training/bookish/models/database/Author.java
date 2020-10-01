package org.softwire.training.bookish.models.database;

public class Author {
        private int Id;
        private String AuthorName;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }
}
