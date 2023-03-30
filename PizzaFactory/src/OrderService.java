
import java.util.ArrayList;
import java.util.*;

public class OrderService {
    private Map<Integer, Order> ordersById;
    private Map<String, List<Order>> ordersByCustomerName;

    public OrderService() {
        ordersById = new HashMap<>();
        ordersByCustomerName = new HashMap<>();
    }

    // Add a new order to the collections
    public void addOrder(Order order) {
        // Add order to the ordersById map
        ordersById.put(order.getId(), order);

        // Add order to the ordersByCustomerName map
        String customerName = order.getCustomerName();
        if (!ordersByCustomerName.containsKey(customerName)) {
            ordersByCustomerName.put(customerName, new ArrayList<>());
        }
        ordersByCustomerName.get(customerName).add(order);
    }

    // Get order by ID
    public Order getOrderById(int orderId) {
        return ordersById.get(orderId);
    }

    // Get orders by customer name
    public List<Order> getOrdersByCustomerName(String customerName) {
        return ordersByCustomerName.getOrDefault(customerName, new ArrayList<>());
    }
}

