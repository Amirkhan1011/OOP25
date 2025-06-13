package practice_3;

public class Book {
	private String name;
	private User user;
	
	// Initialization block
	{
		user = null;
	}
	
	// Constructor
	public Book(String name) {
		this.name = name;
	}

	// Getters and setters
	public String getName() {
		return this.name;
	}
	
	public User getUser() {
		return this.user;
	}
	
	public void setUser(User u) {
		this.user = u;
	}
	
	public String toString() {
		return this.name;
	}
}	