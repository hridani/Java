package onelvshop.ManagerExceptions;

public class ProductOutOfStockException extends ManagementException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProductOutOfStockException() {
		super("This product is out of stock");
	}
}
