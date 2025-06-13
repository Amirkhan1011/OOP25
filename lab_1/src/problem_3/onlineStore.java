package problem_3;

public class onlineStore {
	    public static void main(String[] args) {
	        Order order1 = new Order("Mangekyo Sharingan", 2);
	        Order order2 = new Order("Best Friend");
	        Order order3 = new Order("Kunai", 3);

	        order1.setStatus(OrderStatus.PROCESSING);
	        order2.setStatus(OrderStatus.SHIPPED);
	        order3.setStatus(OrderStatus.DELIVERED);

	        order1.display();
	        order2.display();
	        order3.display();
	        order1.display(true);
	        order2.display(true);
	        order3.display(true);

	        System.out.println();

	        Order.printTotalOrders();
	    }
	}
