package problems;

import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Write a,b,c parametres: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		scan.close();
		
		double d = b*b - 4*a*c;
		System.out.println(Math.sqrt(d));
		if (d < 0) {
			System.out.print("Quadratic equation don't have roots");
		}
		else if (d == 0) {
			int res = -b/(2*a);
			System.out.print(res);
		}
		else {
			int x = (int) (-b + Math.sqrt(d))/(2*a);
			int x2 = (int) (-b - Math.sqrt(d))/(2*a);
			System.out.print("Quadratic equation's roots:\nX1 = " + x + "\nX2 = " + x2 );
		}
	}

}
