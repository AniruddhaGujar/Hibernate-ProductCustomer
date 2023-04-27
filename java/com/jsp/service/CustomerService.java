package com.jsp.service;

import com.jsp.dao.CustomerDao;
import com.jsp.dto.Customer;

public class CustomerService {

	CustomerDao customerDao = new CustomerDao();

	public Customer saveCustomer(Customer customer) {
		if (customer != null) {
			customer.setStatus("Y");
		}
		return customerDao.saveProduct(customer);
	}

	public Customer getCustomerById(int id) {
		if (id > 0) {
			return customerDao.getCustomerById(id);

		}
		return null;
	}

	public Customer updateCustomerByName(String name, int id) {
		Customer c1 = customerDao.getCustomerById(id);
		c1.setName(name);
		return customerDao.updateCustomer(c1);
	}

	public Customer updateCustomerByBrand(String email, int id) {
		Customer c2 = customerDao.getCustomerById(id);
		c2.setEmail(email);
		return customerDao.updateCustomer(c2);

	}

	public Customer deleteCustomertByname(String name, int id) {
		Customer p1 = customerDao.getCustomerById(id);
		p1.setName(name);
		return customerDao.updateCustomer(p1);

	}

}
