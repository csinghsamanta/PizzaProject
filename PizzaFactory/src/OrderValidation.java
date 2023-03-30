import java.util.*;
public class OrderValidation {
	
	

	    private final int MAX_TOPPINGS_PER_PIZZA = 5;
	    private final int MAX_SIDES_PER_ORDER = 5;
	    private final int MAX_QUANTITY_PER_ORDER = 10;

	    public boolean validateOrder(Order order) {
	        // Check if the pizza type is valid for the selected crust and toppings
	        if (!isValidPizzaType(order.getPizza(), order.getToppings(), order.getCrust())) {
	            return false;
	        }

	        // Check if the order quantity is within the allowed limit
	        if (order.getQuantity() > MAX_QUANTITY_PER_ORDER) {
	            return false;
	        }

	        // Check if the number of toppings is within the allowed limit
	        if (order.getToppings().size() > MAX_TOPPINGS_PER_PIZZA) {
	            return false;
	        }

	        // Check if the number of sides is within the allowed limit
	        if (order.getSides().size() > MAX_SIDES_PER_ORDER) {
	            return false;
	        }

	        // Check if all items are in stock
	        if (!areAllItemsInStock(order)) {
	            return false;
	        }

	        // All checks passed, the order is valid
	        return true;
	    }

	    private boolean isValidPizzaType(Pizza pizza, List<Topping> toppings, Crust crust) {
	        // Logic to check if the pizza type is valid for the selected crust and toppings
	        // Return true if the pizza type is valid, false otherwise
	        return true;
	    }

	    private boolean areAllItemsInStock(Order order) {
	        // Logic to check if all items are in stock
	        // Return true if all items are in stock, false otherwise
	        return true;
	    }
	}



