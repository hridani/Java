package onelvshop;

public abstract class Product implements Buyable {
	private String name;
	private double price;
	private int quantity;
	private AgeRestriction ageRestriction;
	
	public Product(String name, double price, int quantity,
			AgeRestriction ageRestriction) {
		super();
		this.setName(name);
		this.setPrice(price);
		this.setQuantity(quantity);
		this.setAgeRestriction(ageRestriction);
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + String.format("%.2f",price) + ", quantity="
				+ quantity + ", ageRestriction=" + ageRestriction
				+ "]";
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		if (name.isEmpty() || name == null) {
			throw new IllegalArgumentException("Product Name cannot be empty or null.");
		}
			
		this.name = name;
	}

	public void setPrice(double price) {
		if (price < 0) {
			throw new IllegalArgumentException("Price cannot be negative.");
		}
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity < 0) {
			throw new IllegalArgumentException("Quantity cannot be negative.");
		}
		
		this.quantity = quantity;
	}
	
	public AgeRestriction getAgeRestriction() {
		return this.ageRestriction;
	}
		
	public void setAgeRestriction(AgeRestriction ageRestriction) {
		this.ageRestriction = ageRestriction;
	}
}
