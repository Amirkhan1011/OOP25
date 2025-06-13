package practice_3;

import java.util.Scanner;
import java.util.Vector;

public class LibrarySystem {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner s = new Scanner(System.in);

        boolean run = true;

        System.out.println("Welcome to the LMS!");
        System.out.println("Available commands:");
        System.out.println("- create user");
        System.out.println("- create book");
        System.out.println("- display books");
        System.out.println("- display users");
        System.out.println("- assign book");
        System.out.println("- remove book");
        System.out.println("- quit");

        while (run) {
            System.out.print("\nEnter the query: ");
            String query = s.nextLine();

            if (query.equals("create user")) {
                System.out.print("Enter username: ");
                String username = s.nextLine();
                
                lib.addUser(new User(username));
                System.out.println("User created!");

            } 
            else if (query.equals("create book")) {
                System.out.print("Enter book name: ");
                String bookName = s.nextLine();
                
                lib.addBook(new Book(bookName));
                System.out.println("Book added!");

            } 
            else if (query.equals("display books")) {
                Vector<Book> currBooks = lib.getBooks();
                
                for (Book currBook : currBooks) {
                    String user = (currBook.getUser() != null) ? currBook.getUser().getName() : "Available";
                    System.out.println(currBook.getName() + " - " + user);
                }

            } 
            else if (query.equals("display users")) {
                Vector<User> users = lib.getUsers();
                
                for (User user : users) {
                    System.out.println("User: " + user.getName());
                    System.out.println("Books: ");
                    for (Book book : user.getBooks()) {
                        System.out.println("- " + book.getName());
                    }
                }

            } 
            else if (query.equals("assign book")) {
                System.out.print("Enter username: ");
                String username = s.nextLine();

                User selectedUser = null;
                for (User user : lib.getUsers()) {
                    if (user.getName().equals(username)) {
                        selectedUser = user;
                        break;
                    }
                }

                if (selectedUser == null) {
                    System.out.println("User not found.");
                    continue;
                }

                System.out.print("Enter book name: ");
                String bookName = s.nextLine();

                Book selectedBook = null;
                for (Book book : lib.getBooks()) {
                    if (book.getName().equals(bookName)) {
                        selectedBook = book;
                        break;
                    }
                }

                if (selectedBook == null) {
                    System.out.println("Book not found.");
                    continue;
                }

                lib.assign(selectedBook, selectedUser);

            } 
            else if (query.equals("remove book")) {
                System.out.print("Enter username: ");
                String username = s.nextLine();

                User selectedUser = null;
                for (User user : lib.getUsers()) {
                    if (user.getName().equals(username)) {
                        selectedUser = user;
                        break;
                    }
                }

                if (selectedUser == null) {
                    System.out.println("User not found.");
                    continue;
                }

                System.out.print("Enter book name: ");
                String bookName = s.nextLine();

                Book selectedBook = null;
                for (Book book : selectedUser.getBooks()) {
                    if (book.getName().equals(bookName)) {
                        selectedBook = book;
                        break;
                    }
                }

                if (selectedBook == null) {
                    System.out.println("Book not found for this user.");
                    continue;
                }

                lib.removeBookFromUser(selectedBook, selectedUser);

            } 
            else if (query.equals("quit")) {
                run = false;
            } 
            else {
                System.out.println("Unknown command.");
            }
        }

        s.close();
        System.out.println("Good bye!");
    }
}
