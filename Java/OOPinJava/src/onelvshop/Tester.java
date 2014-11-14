package onelvshop;



import onelvshop.ManagerExceptions.ManagementException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Tester {

	public Tester() {
	}

	public static void main(String[] args) {
		FoodProduct cigars = new FoodProduct("420 Blaze it fgt", 6.90, 1400, AgeRestriction.Adult);
		Customer pecata = new Customer("Pecata", 17, 30.00);
		System.out.println(pecata.getBalance());
		System.out.println(cigars.getQuantity());
		
		try {
			PurchaseManager.ProcessPurchase(cigars, pecata);
		} catch (ManagementException me) {
			System.err.println(me.getMessage());
		}
		
		System.out.println(pecata.getBalance());
		System.out.println(cigars.getQuantity());
		
		Customer gopeto = new Customer("Gopeto", 18, 0.44);
		try {
			PurchaseManager.ProcessPurchase(cigars,gopeto);
		} catch (ManagementException me) {
			System.err.println(me.getMessage());
		}
		
		FoodProduct cakeDulse = new FoodProduct("Dulse de leche", 36.93, 400, AgeRestriction.Teenager);
		FoodProduct cordonBlew = new FoodProduct("Cordon Bleu", 9.34, 123, AgeRestriction.Teenager);
		FoodProduct bloodyMery=new FoodProduct("BloodyMery", 5.2, 3000, AgeRestriction.Adult);
		FoodProduct kubety=new FoodProduct("kubety", 0.39, 1234, AgeRestriction.Teenager);
		Computer laptopHP=new Computer("HP 255 G2 F0Z56EA",489, 3456,AgeRestriction.None);
		Computer tabletSony=new Computer("Sony Xperia Z2",899, 234,AgeRestriction.Teenager);
		Appliance washBeko=new Appliance("Beko", 456.90, 121, AgeRestriction.Adult);
		
		List<Product> products = new ArrayList<Product>();
		products.add(cakeDulse);
		products.add(cordonBlew);
		products.add(bloodyMery);
		products.add(kubety);
		products.add(laptopHP);
		products.add(tabletSony);
		products.add(washBeko);
		
		Comparator<Product> byDateOfExpiry = (p1, p2) -> 
			((FoodProduct) p1).getExpirationDate().compareTo(((FoodProduct) p1).getExpirationDate());
		Comparator<Product> byPrice = (p1, p2) -> Double.compare(p1.getPrice(), p1.getPrice());
		
		System.out.println("\nFirst products with the soonest date of expiration");
		
		Product expirableProduct = products.stream()
				.filter(p -> p instanceof Expirable)
				.sorted(byDateOfExpiry)
				.findFirst()
				.get();
		
		System.out.println(expirableProduct);
		System.out.println("\nSort products with adult age restriction by price ");
		
		List<Product> adultAgerestrictionByPrice = products.stream()
							.filter(p -> p.getAgeRestriction() == AgeRestriction.Adult)
							.sorted(byPrice)
							.collect(Collectors.toList());
		
		for (Product product : adultAgerestrictionByPrice) {
			System.out.println(product + "\n");
			}
	}
}
