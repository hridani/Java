package onelvshop.ManagerExceptions;

public class ProductHasExpiredException extends ManagementException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProductHasExpiredException() {
				super("This product has expired");
	}

}
