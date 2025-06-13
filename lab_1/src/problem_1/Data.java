package problem_1;

import java.util.Scanner;

public class Data {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String inp = new String();
		Analyzer a = new Analyzer();
		
		while (true) {
			System.out.print("Enter number (Q to quit): ");
			inp = s.nextLine();
			
			
			if (inp.equals("Q")) {
				System.out.println("Average: " + a.getAverage());
				System.out.print("Maximum: " + a.getMaximum());
				s.close();
				break;
			}
			
			double num = Double.parseDouble(inp);
			a.addValue(num);
		
		}
	
	}
}
