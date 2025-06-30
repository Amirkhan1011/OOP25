package task_5;

public class Test {

	public static void main(String[] args) {
		Chocolate[] chocolates = new Chocolate[5];
		chocolates[0] = new Chocolate(120, "Twix");
		chocolates[1] = new Chocolate(140, "Bounti");
		chocolates[2] = new Chocolate(600, "Merci");
		chocolates[3] = new Chocolate(70, "Albeni");
		chocolates[4] = new Chocolate(80, "Snikers");
		
		Sort.bubbleSort(chocolates);
		
		for (Chocolate choco: chocolates) {
			System.out.println(choco);
		}
		
		
		System.out.println();
		
		Time[] times = new Time[3];
		times[0] = new Time(17, 5, 23);
		times[1] = new Time(15, 27, 10);
		times[2] = new Time(12, 32, 4);
		
		Sort.quickSort(times);
		
		for (Time time: times) {
			System.out.println(time);
		}

	}

}