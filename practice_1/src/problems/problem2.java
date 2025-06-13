package problems;

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.print("Write the number: ");
		a = scan.nextInt();
		scan.close();
		
		int area = (int) Math.pow(a, 2);
		int perimeter = a * 4;
		int diagonal = (int) Math.sqrt(a*a + a*a);
		
		System.out.println("Area: " + area + "\nPerimeter: " + perimeter + "\nDiagonal of the square: " + diagonal);
	}

}
