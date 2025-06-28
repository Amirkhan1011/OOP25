package task_2;

import java.io.Serializable;

public class Book implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String title;
	private String author;
	private int year;
	
	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}

	public String toString() {
		return title + ", " + author + "\nYear: " + year + "\n";
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getYear() {
		return year;
	}
}
