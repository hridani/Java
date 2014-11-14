package onelvshop;

import java.sql.Date;
import java.util.Calendar;

public class FoodProduct extends Product implements Expirable {
	private static final int daysExpiry=15;
	private static final double discount=0.7;
	private Calendar dateOfEntry;
	private boolean isDaysExpiryFinush=false;
	
	public FoodProduct(String name, double price, int quantity,
			AgeRestriction ageRestriction) {
		super(name, price, quantity, ageRestriction);
		dateOfEntry=Calendar.getInstance();
	}
	
	@Override
	public double getPrice() {
		if(isDaysExpiryFinush)
		{
			return super.getPrice() * discount;
		}
		else
		{
			if(Warranty.HasWaranty(dateOfEntry.getTime(), getExpirationDate()))
			{
				return super.getPrice();
			}
			else
			{
				isDaysExpiryFinush=true;
				return super.getPrice() *discount;
			}
		}
		
	}
	public boolean isExpired() {
		if(!isDaysExpiryFinush)
		{
			if(!Warranty.HasWaranty(dateOfEntry.getTime(), getExpirationDate()))
			{
				isDaysExpiryFinush=!isDaysExpiryFinush;
			}
		}
		return this.isDaysExpiryFinush;
	}
	
	@Override
	public Date getExpirationDate() {
		Calendar dateAfterDaysExpiry=dateOfEntry;
		dateAfterDaysExpiry.add(Calendar.DATE, daysExpiry);
		Date expirionDate= new java.sql.Date(dateAfterDaysExpiry.getTime().getTime());
		return expirionDate;
	}

}
