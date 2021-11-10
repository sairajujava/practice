package com.factory;

public class FactoryMethodDemo {

	public String provideCon(String conType) {

		if (conType == null) {
			return null;
		} else if (conType.equalsIgnoreCase("mysql")) {
			return new MySql().getConnection();
		} else if (conType.equalsIgnoreCase("oracle")) {
			return new Oracle().getConnection();
		} else if (conType.equalsIgnoreCase("sqlserver")) {
			return new SqlServer().getConnection();
		} else {
			return "requested connection is not available";
		}

	}

}
