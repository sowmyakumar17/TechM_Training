package project;

import java.util.*;
import java.util.concurrent.*;

public class LibrarySimulation {
	 public static void main(String[] args) {
	        LibraryManager library = new LibraryManager();
	        library.addBook(new Book("Java Programming", "James Gosling", "123456"));
	        library.addBook(new Book("Data Structures", "Robert Lafore", "789012"));
	        library.addUser(new User("Alice", "U1"));
	        library.addUser(new User("Bob", "U2"));

	        try {
	            library.borrowBook("123456", "U1");
	            library.returnBook("123456", "U1");
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}

	class Book {
	    @SuppressWarnings("unused")
		private final String title, author, ISBN;
	    private boolean isBorrowed = false;

	    public Book(String title, String author, String ISBN) {
	        this.title = title;
	        this.author = author;
	        this.ISBN = ISBN;
	    }

	    public String getTitle() { return title; }
	    public String getISBN() { return ISBN; }
	    public boolean isBorrowed() { return isBorrowed; }
	    public void borrow() { isBorrowed = true; }
	    public void returnBook() { isBorrowed = false; }
	}

	class User {
	    @SuppressWarnings("unused")
		private final String name, userID;
	    private final List<Book> borrowedBooks = new ArrayList<>();
	    private static final int MAX_BOOKS = 3;

	    public User(String name, String userID) {
	        this.name = name;
	        this.userID = userID;
	    }

	    public String getUserID() { return userID; }
	    public void borrowBook(Book book) throws Exception {
	        if (borrowedBooks.size() >= MAX_BOOKS) throw new Exception("Borrowing limit reached!");
	        borrowedBooks.add(book);
	        book.borrow();
	    }
	    public void returnBook(Book book) { borrowedBooks.remove(book); book.returnBook(); }
	}

	interface ILibrary {
	    void borrowBook(String ISBN, String userID) throws Exception;
	    void returnBook(String ISBN, String userID) throws Exception;
	    Book searchBook(String title);
	}

	abstract class LibrarySystem implements ILibrary {
	    protected final Map<String, Book> books = new ConcurrentHashMap<>();
	    protected final Map<String, User> users = new ConcurrentHashMap<>();
	    public void addBook(Book book) { books.put(book.getISBN(), book); }
	    public void addUser(User user) { users.put(user.getUserID(), user); }
	}

	class LibraryManager extends LibrarySystem {
	    public void borrowBook(String ISBN, String userID) throws Exception {
	        User user = users.get(userID);
	        Book book = books.get(ISBN);
	        if (user == null || book == null) throw new Exception("User or book not found!");
	        if (book.isBorrowed()) throw new Exception("Book already borrowed!");
	        user.borrowBook(book);
	        System.out.println(userID + " borrowed " + ISBN);
	    }

	    public void returnBook(String ISBN, String userID) throws Exception {
	        User user = users.get(userID);
	        Book book = books.get(ISBN);
	        if (user == null || book == null) throw new Exception("User or book not found!");
	        user.returnBook(book);
	        System.out.println(userID + " returned " + ISBN);
	    }

	    public Book searchBook(String title) {
	        return books.values().stream().filter(b -> b.getTitle().equalsIgnoreCase(title)).findFirst().orElse(null);
	    }


}
