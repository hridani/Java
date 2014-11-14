package onelvshop;

import java.sql.Date;
import java.text.ParseException;

public interface Expirable {
	Date getExpirationDate() throws ParseException;
}
