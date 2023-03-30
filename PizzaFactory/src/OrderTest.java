import org.junit.Test;
	import static org.junit.Assert.*;
	import java.util.Arrays;
	import java.util.List;
public class OrderTest {
	

	
	    
	    @Test
	    public void testAddItemAndGetItems() {
	        Order order = new Order();
	        Pizza pizza = new Pizza("Pepperoni", 12.99, "Regular", Size.MEDIUM, new Crust("Thin", 1.99),
					Arrays.asList(new Topping("Mushrooms", 0.99), new Topping("Onions", 0.99)),
					Arrays.asList(new Side("Garlic Bread", 3.99)));
	        Size size = Size.MEDIUM;
	        Crust crust = new Crust("Thin", 1.99);
	        List<Topping> toppings = Arrays.asList(new Topping("Mushrooms", 0.99), new Topping("Onions", 0.99));
	        List<Side> sides = Arrays.asList(new Side("Garlic Bread", 3.99));
	        int quantity = 2;
	        OrderItem orderItem = new OrderItem(pizza, size, crust, toppings, sides, quantity);
	        order.addItem(orderItem);
	        List<OrderItem> items = order.getItems();
	        assertEquals(items.size(), 1);
	        assertEquals(items.get(0), orderItem);
	    }
	    
	    @Test
	    public void testCalculateTotalAmount() {
	        OrderValidation orderValidation = new OrderValidation();
	        Pizza pizza = new Pizza("Pepperoni", 12.99, "Regular", Size.MEDIUM, new Crust("Thin", 1.99),
					Arrays.asList(new Topping("Mushrooms", 0.99), new Topping("Onions", 0.99)),
					Arrays.asList(new Side("Garlic Bread", 3.99)));
	        Size size = Size.MEDIUM;
	        Crust crust = new Crust("Thin", 1.99);
	        List<Topping> toppings = Arrays.asList(new Topping("Mushrooms", 0.99), new Topping("Onions", 0.99));
	        List<Side> sides = Arrays.asList(new Side("Garlic Bread", 3.99));
	        int quantity = 2;
	        OrderItem orderItem = new OrderItem(pizza, size, crust, toppings, sides, quantity);
	        double totalAmount = orderValidation.calculateTotalAmount(orderItem);
	        assertEquals(totalAmount, 34.94, 0.001);
	    }
	    
	    @Test
	    public void testIsValidPizzaType() {
	        OrderValidation orderValidation = new OrderValidation();
	        Pizza pizza = new Pizza("Pepperoni", 12.99, "Regular", Size.MEDIUM, new Crust("Thin", 1.99),
					Arrays.asList(new Topping("Mushrooms", 0.99), new Topping("Onions", 0.99)),
					Arrays.asList(new Side("Garlic Bread", 3.99)));
	        List<Topping> toppings = Arrays.asList(new Topping("Mushrooms", 0.99), new Topping("Onions", 0.99));
	        Crust crust = new Crust("Thin", 1.99);
	        boolean validPizzaType = orderValidation.isValidPizzaType(pizza, toppings, crust);
	        assertTrue(validPizzaType);
	    }
	}


}
