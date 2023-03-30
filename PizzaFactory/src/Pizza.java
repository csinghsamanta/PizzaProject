import java.util.*;
public class Pizza {
	
	    private String name;
	    private double price;
	    private String type;
	    private List<Crust> crustOptions;
	    private List<Topping> toppingOptions;
	    private List<Side> sideOptions;
		private Size size;
		private Crust crust;


	    public Pizza(String name, double price, String type, Size size, Crust crust, List<Topping> toppingOptions, List<Side> sideOptions) {
	        this.name = name;
	        this.price = price;
	        this.type = type;
	        this.size = size;
	        this.crust = crust;
	        this.toppingOptions = toppingOptions;
	        this.sideOptions = sideOptions;
	    }


		/*
		 * public Pizza(String name, double price, String type, List<Crust>
		 * crustOptions, List<Topping> toppingOptions, List<Side> sideOptions) {
		 * super(); this.name = name; this.price = price; this.type = type;
		 * this.crustOptions = crustOptions; this.toppingOptions = toppingOptions;
		 * this.sideOptions = sideOptions; }
		 */
	    
	    public String getName() {
	        return name;
	    }

		public List<Crust> getCrustOptions() {
	        return crustOptions;
	    }

	    public List<Topping> getToppingOptions() {
	        return toppingOptions;
	    }

	    public List<Side> getSideOptions() {
	        return sideOptions;
	    }

		public String getType() {
			// TODO Auto-generated method stub
			return type;
		}


		public double getPrice() {
			// TODO Auto-generated method stub
			return price;
		}
	}





