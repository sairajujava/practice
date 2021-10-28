package com.main.onetoonetest;

import com.dao.CustomerDao;
import com.entity.onetoone.Customer;
import com.entity.onetoone.CustomerDetails;

public class CustomerTest {

	public static void main(String[] args) {

		CustomerDao cdao = new CustomerDao();

		// set the data for customer

		Customer c = new Customer("Swati", "swati@gmail.com", "6390778866");
		CustomerDetails cd = new CustomerDetails("Playing Chess", "9012-2233-4455");
		c.setCdetails(cd);
		cd.setCust(c);
	//	Long i = cdao.saveCustomer(c);
	//	System.out.println("Record :" + i);
		
		System.out.println("=====================================");
		
		Customer cust = cdao.fetchById(12L);
		System.out.println(cust.getId()+" : " + cust.getName() + " : "+cust.getCdetails().getAadarNum());
		
		System.out.println("=====================================");
		
		CustomerDetails cdetails = cust.getCdetails();
		cdetails.setAadarNum("3456-6789-1234");
		cust.setCdetails(cdetails);
		
		cdao.updateCustDetails(cust);

	}

}
