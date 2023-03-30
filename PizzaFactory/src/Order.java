import java.util.*;
public class Order {

	private int id;
	private Pizza pizza;
    private String customerName;
    private List<OrderItem> items;
	private Crust crust;
	private int quantity;
	private List<Side> sides;
    
    public Order(int id, String customerName) {
        this.id = id;
        this.customerName = customerName;
        this.items = new ArrayList<>();
    }

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        this.items.add(item);
    }

    public List<OrderItem> getItems() {
        return items;
    }

	public String getCustomerName() {
		return this.customerName;
	}

	public int getId() {
		return id;
	}

	public Pizza getPizza() {
        return this.pizza;
    }

	public List<Topping> getToppings() {
	    List<Topping> toppings = new ArrayList<>();
	    for (OrderItem item : items) {
	        toppings.addAll(item.getToppings());
	    }
	    return toppings;
	}
	
	public Crust getCrust() {
	    return this.crust;
	}
	
	public int getQuantity() {
		return quantity;
    }
	
	public List<Side> getSides() {
        return sides;
    }

}
