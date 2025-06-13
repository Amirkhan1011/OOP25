package problems;

public class Student {

	public String name;
	public int id;
	public static int year_of_study = 0;
//	public int year_of_study = 0;
//	
//	private static int year = 0; 
//	public Student() {
//		year++;
//		this.year_of_study = year;
//	}
	public Student() {
		year_of_study++;
	}

	public void setName(String newName) {
		name = newName;
	}
	public void setId(int newId) {
		id = newId;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Jojo");
		student.setId(89549);
		
		
		System.out.println("Student's name: " + student.getName() + "\nID: " + student.getId() + "\nYear of study: " + Student.year_of_study);		
		}
}
