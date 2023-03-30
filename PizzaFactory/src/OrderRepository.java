import java.util.*;
public class OrderRepository {
	
	

	
	    private Map<String, Order> ordersByCustomerName;
	    private Map<Integer, Order> ordersById;

	    public OrderRepository() {
	        ordersByCustomerName = new HashMap<>();
	        ordersById = new HashMap<>();
	    }

	    public void addOrder(Order order) {
	        ordersByCustomerName.put(order.getCustomerName(), order);
	        ordersById.put(order.getId(), order);
	    }

	    public List<Order> getOrdersByCustomerName(String customerName) {
	        List<Order> orders = new ArrayList<>();
	        if (ordersByCustomerName.containsKey(customerName)) {
	            orders.add(ordersByCustomerName.get(customerName));
	        }
	        return orders;
	    }

	    public Order getOrderById(String id) {
	        return ordersById.get(id);
	    }
	}



