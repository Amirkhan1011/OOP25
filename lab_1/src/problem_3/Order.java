package problem_3;


// onlineStore
enum OrderStatus {
    NEW,
    PROCESSING,
    SHIPPED,
    DELIVERED
}

public class Order {
    private static int orderCount = 0; 
    private final int orderId;         
    private String productName;
    private int quantity;
    private OrderStatus status;

    {
        orderCount++;
        orderId = orderCount;
    }

    public Order(String productName, int quantity) {
        this.productName = productName; 
        this.quantity = quantity;
        this.status = OrderStatus.NEW;
    }

    public Order(String productName) {
        this(productName, 1); 
    }

 
    public int getOrderId() {
        return orderId;
    }


    public String getProductName() {
        return productName;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public OrderStatus getStatus() {
        return status;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void display() {
        System.out.println("Order #" + orderId + ": " + productName + " x" + quantity + " [" + status + "]");
    }

    public void display(boolean showStatusOnly) {
        if (showStatusOnly) {
            System.out.println("Order #" + orderId + " is currently: " + status);
        } else {
            display();
        }
    }

    public static void printTotalOrders() {
        System.out.println("Total orders: " + orderCount);
    }
}
