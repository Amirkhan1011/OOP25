package problem_1;

public class LibraryTest {

	public static void main(String[] args) {
		DVD dvd = new DVD("Shutter Island", "Christopher Nolan", 2010, "Thriller");
		System.out.println("-------------DVD INFO--------------");
		System.out.println(dvd);
		System.out.println("-------------========--------------\n");		
		
		
		dvd.borrow();
		System.out.println("-------------DVD INFO--------------");
		System.out.println(dvd);
		System.out.println("-------------========--------------\n\n");
		
		dvd.borrow();
		
		dvd.returnItem();
		System.out.println("-------------DVD INFO--------------");
		System.out.println(dvd);
		System.out.println("-------------========--------------");
	}

}
