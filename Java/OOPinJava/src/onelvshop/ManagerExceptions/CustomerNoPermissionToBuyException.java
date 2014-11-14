package onelvshop.ManagerExceptions;

public class CustomerNoPermissionToBuyException extends ManagementException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomerNoPermissionToBuyException() {
		super("You are too young to buy this product!");
	}

}
