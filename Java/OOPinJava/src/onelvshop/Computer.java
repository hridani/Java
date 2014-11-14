package onelvshop;

public class Computer extends ElectonicsProduct {
    private static final double discount=0.95;
	public Computer(String name, double price, int quantity,
			AgeRestriction ageRestriction) {
		super(name, price, quantity, ageRestriction, 24);
	}

	@Override
	public double getPrice() {
		if (this.getQuantity() > 1000) {
			return this.getPrice() * discount;
		}
			
		return super.getPrice();
	}
}
