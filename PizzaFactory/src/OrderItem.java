import java.util.List;

public class OrderItem {

	private MenuItem menuItem;
	private Size size;
	private List<Topping> toppings;
	private Crust crust;
	private List<Side> sides;
	private int quantity;
	private Pizza pizza;

	public OrderItem(Pizza pizza, Size size, Crust crust, List<Topping> toppings, List<Side> sides, int quantity) {
		this.pizza = pizza;
		this.size = size;
		this.crust = crust;
		this.toppings = toppings;
		this.sides = sides;
		this.quantity = quantity;
	}

	/*
	 * public OrderItem(MenuItem menuItem, Size size, List<Topping> toppings, Crust
	 * crust, List<Side> sides, int quantity) { this.menuItem = menuItem; this.size
	 * = size; this.toppings = toppings; this.crust = crust; this.sides = sides;
	 * this.quantity = quantity; }
	 */

	public MenuItem getMenuItem() {
		return menuItem;
	}

	public Size getSize() {
		return size;
	}

	public List<Topping> getToppings() {
		return toppings;
	}

	public Crust getCrust() {
		return crust;
	}

	public List<Side> getSides() {
		return sides;
	}

	public int getQuantity() {
		return quantity;
	}

}
