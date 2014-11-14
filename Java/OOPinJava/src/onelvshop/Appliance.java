package onelvshop;

public class Appliance extends ElectonicsProduct {
	private static final double overcharge=1.05;
	public Appliance(String name, double price, int quantity,
			AgeRestriction ageRestriction) {
		super(name, price, quantity, ageRestriction, 6);
		
	}
	
	@Override
	public double getPrice() {
		if (this.getQuantity() < 50) {
			return this.getPrice() * overcharge;
		}
			
		return super.getPrice();
	}
}
