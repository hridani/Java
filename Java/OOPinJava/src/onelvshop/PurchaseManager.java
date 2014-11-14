package onelvshop;

import onelvshop.ManagerExceptions.CustomerNoPermissionToBuyException;
import onelvshop.ManagerExceptions.InsufficientBalanceException;
import onelvshop.ManagerExceptions.ManagementException;
import onelvshop.ManagerExceptions.ProductHasExpiredException;
import onelvshop.ManagerExceptions.ProductOutOfStockException;

public class PurchaseManager {

	public PurchaseManager() {
	}
	
	public static void ProcessPurchase(Product product, Customer customer) throws ManagementException {
		
		if(product instanceof FoodProduct){
			if(((FoodProduct) product).isExpired()){
				throw new ProductHasExpiredException();
			}
		}
		
		if (product.getQuantity() < 1) {
			throw new ProductOutOfStockException();
			}
		
		
		if (product.getPrice() > customer.getBalance()) {
			throw new InsufficientBalanceException();
		}
		
		if (product.getAgeRestriction() == AgeRestriction.Adult &&
				customer.getAge() < 18) {
				throw new CustomerNoPermissionToBuyException();
				}
		customer.setBalance(customer.getBalance()-product.getPrice());
		product.setQuantity(product.getQuantity() - 1);
	}
}
