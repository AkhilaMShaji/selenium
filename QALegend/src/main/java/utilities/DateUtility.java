package utilities;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class DateUtility {
public static String getUserLoginDate(String format) {
	DateFormat dateformat=new SimpleDateFormat(format) ;
	Date currentdate= new Date();
	return dateformat.format(currentdate);
}
}
