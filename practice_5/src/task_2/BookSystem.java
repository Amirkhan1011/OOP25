package task_2;

import java.io.*;
import java.util.*;

public class BookSystem {

    private static final String data = "books.dat";
    private static ArrayList<Book> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadBooks();

        System.out.println("Welcome to the Book Manager System!");
        System.out.println("Available commands:");
        System.out.println("- (A)dd book");
        System.out.println("- (L)ist all");
        System.out.println("- (Q)uit");

        boolean run = true;
        while (run) {
            System.out.print("Choose: ");
            String choice = scanner.nextLine().trim().toUpperCase();

            switch (choice) {
                case "A":
                    addBook();
                    break;
                case "L":
                    listBooks();
                    break;
                case "Q":
                    saveBooks();
                    run = false;
                    scanner.close();
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private static void loadBooks() {
        File file = new File(data);
        if (!file.exists()) {
            books = new ArrayList<>();
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            books = (ArrayList<Book>) ois.readObject();
        } catch (Exception ex) {
            System.out.println("Error loading books: " + ex.getMessage());
            books = new ArrayList<>();
        }
    }

    private static void addBook() {
        System.out.print("Title: ");
        String title = scanner.nextLine().trim();
        System.out.print("Author: ");
        String author = scanner.nextLine().trim();
        System.out.print("Year: ");
        int year = Integer.parseInt(scanner.nextLine().trim());

        books.add(new Book(title, author, year));
        System.out.println("Book added.");
    }

    private static void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books found.");
        } else {
            System.out.println("Books:");
            for (Book book : books) {
                System.out.println("- " + book);
            }
        }
    }

    private static void saveBooks() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(data))) {
            oos.writeObject(books);
        } catch (IOException e) {
            System.err.println("Error saving books: " + e.getMessage());
        }
    }
}
