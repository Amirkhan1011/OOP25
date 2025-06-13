package problems;

import java.util.Scanner;

public class problem1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Write your name: ");
		String s = scan.nextLine();
		scan.close();
		int a = s.length();
		
		
		System.out.print("+");
		for (int i = 0; i < a; i++) {
			System.out.print("-");
		}
		System.out.println("+");
		
		System.out.println("|" + s +"|");
		
		System.out.print("+");
		for (int i = 0; i < a; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}
