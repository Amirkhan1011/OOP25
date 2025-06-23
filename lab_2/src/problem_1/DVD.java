package problem_1;

public class DVD extends LibraryItem{

	public DVD(String title, String author, int publicationYear, String genre) {
		super(title, author, publicationYear, genre);
	}

	@Override
	public String getItemType() {
		return "DVD";
	}

	@Override
	public int getMaxBorrowDays() {
		return 14;
	}

	@Override
	public double penaltyPerDay() {
		return 500.0;
	}
	
	public String toString() {
		return super.toString() + "\nType: " + getItemType();
 	}

}
