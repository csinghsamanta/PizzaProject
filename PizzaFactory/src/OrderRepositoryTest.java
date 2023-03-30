import org.junit.Test;
	import static org.junit.Assert.*;
	import java.util.Arrays;
	import java.util.List;
public class OrderRepositoryTest {
	

	
	    
	    @Test
	    public void testAddAndGetOrder() {
	        OrderRepository repository = new OrderRepository();
	        Pizza pizza = new Pizza("Margherita", 8.99);
	        Size size = Size.MEDIUM;
	        Crust crust = Crust.THIN;
	        List<Topping> toppings = Arrays.asList(Topping.TOMATO, Topping.MUSHROOM);
	        List<Side> sides = Arrays.asList(Side.COKE);
	        int quantity = 2;
	        OrderItem orderItem = new OrderItem(pizza, size, crust, toppings, sides, quantity);
	        Order order = new Order("John", "123 Main St", "555-1234", Arrays.asList(orderItem));
	        repository.addOrder(order);
	        assertEquals(order, repository.getOrderById(order.getId()));
	        assertEquals(Arrays.asList(order), repository.getOrdersByCustomerName("John"));
	    }
	    
	    @Test
	    public void testGetOrdersByCustomerName() {
	        OrderRepository repository = new OrderRepository();
	        Pizza pizza = new Pizza("Margherita", 8.99);
	        Size size = Size.MEDIUM;
	        Crust crust = Crust.THIN;
	        List<Topping> toppings = Arrays.asList(Topping.TOMATO, Topping.MUSHROOM);
	        List<Side> sides = Arrays.asList(Side.COKE);
	        int quantity = 2;
	        OrderItem orderItem = new OrderItem(pizza, size, crust, toppings, sides, quantity);
	        Order order1 = new Order("John", "123 Main St", "555-1234", Arrays.asList(orderItem));
	        Order order2 = new Order("John", "456 Elm St", "555-5678", Arrays.asList(orderItem));
	        Order order3 = new Order("Jane", "789 Oak St", "555-9012", Arrays.asList(orderItem));
	        repository.addOrder(order1);
	        repository.addOrder(order2);
	        repository.addOrder(order3);
	        assertEquals(Arrays.asList(order1, order2), repository.getOrdersByCustomerName("John"));
	        assertEquals(Arrays.asList(order3), repository.getOrdersByCustomerName("Jane"));
	        assertTrue(repository.getOrdersByCustomerName("Bob").isEmpty());
	    }
	    
	    @Test
	    public void testGetOrderById() {
	        OrderRepository repository = new OrderRepository();
	        Pizza pizza = new Pizza("Margherita", 8.99);
	        Size size = Size.MEDIUM;
	        Crust crust = Crust.THIN;
	        List<Topping> toppings = Arrays.asList(Topping.TOMATO, Topping.MUSHROOM);
	        List<Side> sides = Arrays.asList(Side.COKE);
	        int quantity = 2;
	        OrderItem orderItem = new OrderItem(pizza, size, crust, toppings, sides, quantity);
	        Order order1 = new Order("John", "123 Main St", "555-1234", Arrays.asList(orderItem));
	        Order order2 = new Order("Jane", "456 Elm St", "555-5678", Arrays.asList(orderItem));
	        repository.addOrder(order1);
	        repository.addOrder(order2);
	        assertEquals(order1, repository.getOrderById(order1.getId()));
	        assertEquals(order2, repository.getOrderById(order2.getId()));
	        assertNull(repository.getOrderById("nonexistent"));
	    }
	}


}
