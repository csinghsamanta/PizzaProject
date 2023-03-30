import java.util.ArrayList;
public class OrderManager {
	

	
	    private ArrayList<Order> orders;
	    
	    public OrderManager() {
	        orders = new ArrayList<Order>();
	    }
	    
	    // Methods to add and retrieve orders from the collection
	    
	    public void addOrder(Order order) {
	        orders.add(order);
	    }
	    
	    public ArrayList<Order> getOrders() {
	        return orders;
	    }
	}



