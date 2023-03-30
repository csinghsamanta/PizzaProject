import java.util.List;
public class OrderCalculator {
	

	    public static double calculateTotalAmount(Pizza pizza, Size size, Crust crust, List<Topping> toppings, List<Side> sides, int quantity) {
	        double pizzaPrice = pizza.getPrice();
	        double price = pizza.getPrice();
	        double crustPrice = crust.getPrice();
	        double toppingsPrice = toppings.stream().mapToDouble(Topping::getPrice).sum();
	        double sidesPrice = sides.stream().mapToDouble(Side::getPrice).sum();

	        return quantity * (pizzaPrice + price + crustPrice + toppingsPrice + sidesPrice);
	    }
	}

