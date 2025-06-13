package problem_4;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GradeBook gradeBook = new GradeBook();
        Course course = new Course("CS101 Object-oriented Programming and Design", 
                "OOP helps to create more complex programs",
                3, "Programming Principles II");
        gradeBook.displayMessage();
        System.out.println(course);
        
        String names[] = {"A","B","C","D","E","F","G","H","I","J"};

        for(int i = 0; i < names.length; i++) {
            System.out.print("Student " + names[i] + ": ");
            Student student = new Student("Student " + names[i], s.nextInt());
            gradeBook.addlist(student);
        }
        s.close();
        gradeBook.displayGradeReport();
    }
}