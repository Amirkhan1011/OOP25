package practice_3;

import java.util.Vector;

public class User {
    private String name;
    private Vector<Book> books;

    {
        this.books = new Vector<Book>();
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Vector<Book> getBooks() {
        return this.books;
    }
    
    public void addBook(Book b) {
        books.add(b);
    }

    public void removeBook(Book b) {
        books.remove(b);
    }

    public String toString() {
        return this.name;
    }
}
