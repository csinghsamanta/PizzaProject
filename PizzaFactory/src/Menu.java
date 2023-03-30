import java.util.*;
public class Menu {
	
	    // ArrayList to store all Pizza objects
	    private ArrayList<Pizza> pizzas;
	    
	    // HashMap to store all Crust objects
	    private HashMap<String, Crust> crusts;
	    
	    // HashMap to store all Topping objects
	    private HashMap<String, Topping> toppings;
	    
	    // ArrayList to store all Side objects
	    private ArrayList<Side> sides;

	    // Constructor to initialize the collections
	    public Menu() {
	        pizzas = new ArrayList<>();
	        crusts = new HashMap<>();
	        toppings = new HashMap<>();
	        sides = new ArrayList<>();
	    }
	    
	    
	    //addPizza
	    public void addPizza(String name, double price, String type,Size size, Crust crust, List<Topping> toppingOptions, List<Side> sideOptions) {
	        Pizza pizza = new Pizza(name, price, type,size,crust, toppingOptions, sideOptions);
	        pizzas.add(pizza);
	    }
	    
	    
	    //addCrust
	    public void addCrust(String name, double price) {
	        Crust crust = new Crust(name, price);
	        crusts.put(name, crust);
	    }
	    
	    
	    //addTopping
	    public void addTopping(String name, double price) {
	        Topping topping = new Topping(name, price);
	        toppings.put(name, topping);
	    }
	    
	    
	    //addSide
	    public void addSide(String name, double price) {
	        Side side = new Side(name, price);
	        sides.add(side);
	    }
	    
	    public Pizza getPizzaByName(String name) {
	        for (Pizza pizza : pizzas) {
	            if (pizza.getName().equals(name)) {
	                return pizza;
	            }
	        }
	        return null;
	    }

	    public List<Pizza> getPizzasByType(String type) {
	        List<Pizza> result = new ArrayList<>();
	        for (Pizza pizza : pizzas) {
	            if (pizza.getType().equals(type)) {
	                result.add(pizza);
	            }
	        }
	        return result;
	    }

	    public Crust getCrustByName(String name) {
	    	List<Crust> crusts = new ArrayList<>();

	        for (Crust crust : crusts) {
	            if (crust.getName().equals(name)) {
	                return crust;
	            }
	        }
	        return null;
	    }


	    public Topping getToppingByName(String name) {
	    	List<Topping> toppings = new ArrayList<>();
	        for (Topping topping : toppings) {
	            if (topping.getName().equals(name)) {
	                return topping;
	            }
	        }
	        return null;
	    }

	    public Side getSideByName(String name) {
	        for (Side side : sides) {
	            if (side.getName().equals(name)) {
	                return side;
	            }
	        }
	        return null;
	    }






	    
	    // Getter methods for the collections
	    public ArrayList<Pizza> getPizzas() {
	        return pizzas;
	    }

	    public HashMap<String, Crust> getCrusts() {
	        return crusts;
	    }

	    public HashMap<String, Topping> getToppings() {
	        return toppings;
	    }

	    public ArrayList<Side> getSides() {
	        return sides;
	    }
	}

	


