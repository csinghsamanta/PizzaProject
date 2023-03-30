import java.util.*;

public class Main {

	public static void main(String[] args) {
		// create an instance of OrderService
		OrderService orderService = new OrderService();

		// create an order with some details
		Pizza pizza = new Pizza("Pepperoni", 12.99, "Regular", Size.MEDIUM, new Crust("Thin", 1.99),
				Arrays.asList(new Topping("Mushrooms", 0.99), new Topping("Onions", 0.99)),
				Arrays.asList(new Side("Garlic Bread", 3.99)));
		Size size = Size.MEDIUM;
		Crust crust = new Crust("Thin", 1.99);
		List<Topping> toppings = new ArrayList<>();
		toppings.add(new Topping("Mushrooms", 0.99));
		toppings.add(new Topping("Onions", 0.99));
		List<Side> sides = new ArrayList<>();
		sides.add(new Side("Garlic Bread", 3.99));
		int quantity = 2;
		OrderItem orderItem = new OrderItem(pizza, size, crust, toppings, sides, quantity);
		Order order = new Order();
		order.addItem(orderItem);
		// add the order to the order service
		orderService.addOrder(order);
	}

}
