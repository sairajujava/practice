package jdbc.utils;

import java.sql.Date;

public class DateUtils {

	public static Date strDateToSqlDate(String strDate) {
		
		Date sqlDate = Date.valueOf(strDate);
		//System.out.println("sqldate:"+sqlDate);
		return sqlDate;
		
	}
	public static void main(String[] args) {
		
		strDateToSqlDate("2015-03-31");

	}


}
