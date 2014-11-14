package onelvshop;

public abstract class ElectonicsProduct extends Product {

	private int guaranteePeriodInMonths;
	
	public ElectonicsProduct(String name, double price, int quantity,
			AgeRestriction ageRestriction, int guaranteePeriod) {
		super(name, price, quantity, ageRestriction);
		this.setGuaranteePeriodInMonths(guaranteePeriod);
	}

	@Override
	public double getPrice() {
		return 0;
	}

	public int getGuaranteePeriodInMonths() {
		return guaranteePeriodInMonths;
	}

	public void setGuaranteePeriodInMonths(int guaranteePeriodInMonths) {
		if (guaranteePeriodInMonths < 0) {
			throw new IllegalArgumentException("Guarantee Period Cannot be negative");
		}
		
		this.guaranteePeriodInMonths = guaranteePeriodInMonths;
	}
}
