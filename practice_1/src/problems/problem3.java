package problems;

import java.util.Scanner;

public class problem3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Write your points: ");
		int points = scan.nextInt();
		scan.close();
		
		if (points > 94) {
			System.out.print("Your grade: A");
		}
		else if (points > 89) {
			System.out.print("Your grade: A-");
		}
		else if (points > 84) {
			System.out.print("Your grade: B+");
		}
		else if (points > 79) {
			System.out.print("Your grade: B");
		}
		else if (points > 74) {
			System.out.print("Your grade: B-");
		}
		else if (points > 69) {
			System.out.print("Your grade: C+");
		}
		else if (points > 64) {
			System.out.print("Your grade: C");
		}
		else if (points > 59) {
			System.out.print("Your grade: C-");
		}
		else if (points > 54) {
			System.out.print("Your grade: D+");
		}
		else if (points > 49) {
			System.out.print("Your grade: D");
		}

		else {
			System.out.print("It's retake");
		}
		
	}
	
}
