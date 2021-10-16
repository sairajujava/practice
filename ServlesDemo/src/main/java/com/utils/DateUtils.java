package com.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateUtils {
	private static java.sql.Date convertUtilsToSqlDate() {
		java.util.Date utilPackageDate = new java.util.Date();

		// Print and display the utility package date in
		// java
		System.out.println("Util Package date in Java is : " + utilPackageDate);

		// Date class of sql package contains only date
		// information without time
		java.sql.Date sqlPackageDate = new java.sql.Date(utilPackageDate.getTime());

		return sqlPackageDate;
	}
	
	public static java.sql.Date convertStrDateToSqlDate(String str) {
		
		java.util.Date date1;
		java.sql.Date sqlDate = null;
		
		try {
			date1 = new SimpleDateFormat("yyyy-MM-dd").parse(str);
			sqlDate =  new java.sql.Date(date1.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		return sqlDate;
	}

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		String s = "23-07-1995";
		convertUtilsToSqlDate();
		convertStrDateToSqlDate(s);

	}

}
