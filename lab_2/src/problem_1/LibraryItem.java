package problem_1;
import java.time.LocalDate;

public abstract class LibraryItem {
	private String title;
	private String author;
	private int publicationYear;
	private String genre;
	private boolean isBorrowed = false;
	private LocalDate borrowDate;
	private LocalDate dueDate;
	
	
	public LibraryItem(String title, String author, int publicationYear, String genre) {
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
		this.genre = genre;
	}
	

	
	public abstract String getItemType(); //book, DVD or magazine
	public abstract int getMaxBorrowDays();
	public abstract double penaltyPerDay();

	public void borrow() {
		if (isBorrowed) {
			System.out.println("Item is already borrowed");
			return;
		}
		this.isBorrowed = true;
		this.borrowDate = LocalDate.now();
		this.dueDate = borrowDate.plusDays(getMaxBorrowDays());
		System.out.println("Item borrowed. Thanks!");
	}
	
	public void returnItem() {
		if (!isBorrowed) {
			System.out.println("Item is not borrowed");
			return;
		}
		this.isBorrowed = false;
		this.borrowDate = null;
		this.dueDate = null;
		System.out.println("Item returned. Thanks!");
	}
	
	public boolean isOverdue() {
		if (LocalDate.now().isAfter(dueDate)) {
			return true;
		}
		return false;
	}
	
	public double Penalty() {
		if (!isOverdue()) {
			return 0.0;
		}
		int overdueDays = (int) (LocalDate.now().toEpochDay() - dueDate.toEpochDay());
		return overdueDays * penaltyPerDay();
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {	
		return author;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public String getGenre() {
		return genre;
	}
	
	public String toString() {
	    return "Title: " + title +
	           "\nAuthor: " + author + ", Genre: " + genre + ", Publication Year: " + publicationYear +
	           (isBorrowed ? "\nDue Date: " + dueDate + ", Borrow Days: " + getMaxBorrowDays() + ", Penalty per Day: " + penaltyPerDay()
	           : "\nAvalaible to borrow");
	           }
	
}
