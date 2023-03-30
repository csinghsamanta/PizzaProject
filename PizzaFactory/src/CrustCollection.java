import java.util.ArrayList;
	import java.util.List;


public class CrustCollection {
	
	    
	    private List<Crust> crusts = new ArrayList<>();
	    private List<Topping> toppings = new ArrayList<>();


	    public CrustCollection() {
	        crusts = new ArrayList<>();
	    }

	    public void addCrust(String name, double price) {
	        Crust crust = new Crust(name, price);
	        crusts.add(crust);
	    }

	    public Crust getCrustByName(String name) {
	        for (Crust crust : crusts) {
	            if (crust.getName().equals(name)) {
	                return crust;
	            }
	        }
	        return null;
	    }
	    
	   


	  
	}



