package problems;

import java.util.Scanner;

public class problem5 {

	public static void main(String[] args) {
		int balance, interest;
		Scanner scan = new Scanner(System.in);
		System.out.print("Write the balance and interest: ");
		balance = scan.nextInt();
		interest = scan.nextInt();
		scan.close();
		
		int percent = (balance * interest)/100;
		
		System.out.println("Your balance: " + balance + percent);

	}

}
