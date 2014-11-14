package onelvshop.ManagerExceptions;

public class InsufficientBalanceException extends ManagementException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException() {
		super("You don`t have enough money to buy this product");
	}

}
