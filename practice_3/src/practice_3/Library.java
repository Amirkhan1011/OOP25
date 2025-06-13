package practice_3;

import java.util.Vector;

public class Library {
    private Vector<Book> books;
    private Vector<User> users;

    {
        books = new Vector<Book>();
        users = new Vector<User>();
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public Vector<Book> getBooks() {
        return this.books;
    }

    public void addUser(User u) {
        users.add(u);
    }

    public Vector<User> getUsers() {
        return this.users;
    }

    public void assign(Book b, User u) {
        if (b.getUser() != null) {
            System.out.println("This book is already assigned to " + b.getUser().getName());
            return;
        }
        b.setUser(u);
        u.addBook(b);
        System.out.println("Book '" + b.getName() + "' assigned to " + u.getName());
    }

    public void removeBookFromUser(Book b, User u) {
        if (b.getUser() == null || !b.getUser().equals(u)) {
            System.out.println("This user doesn't have this book.");
            return;
        }
        b.setUser(null);
        u.removeBook(b);
        System.out.println("Book '" + b.getName() + "' removed from " + u.getName());
    }
}
