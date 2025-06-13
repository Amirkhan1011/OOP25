package problems;

import java.util.Scanner;

public class problem6 {

	public static void main(String[] args) {
		String s, s2;
		Scanner scan = new Scanner(System.in);
		System.out.println("First string: ");
		s = scan.nextLine();
		scan.close();
		s2 = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			s2 += ch;
		}
		if (s.equals(s2)) {
		    System.out.println("Palindrome");
		} else {
		    System.out.println("Not palindrome");
		}

	}

}
