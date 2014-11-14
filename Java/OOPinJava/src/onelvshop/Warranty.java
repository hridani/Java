package onelvshop;

import java.util.Date;

public abstract class Warranty {

	public  static boolean HasWaranty(Date today, Date warrantyDate)
	{
		int resultCompareTwoDays=today.compareTo(warrantyDate);
		return resultCompareTwoDays > 0 ? false : true;
	}
}
