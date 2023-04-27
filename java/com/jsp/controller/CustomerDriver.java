package com.jsp.controller;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;

public class CustomerDriver {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setName("Aniruddha");
		customer.setEmail("Aniruddha@gmail.com");
		customer.setStatus("paid");

		CustomerService customerService = new CustomerService();
		Customer customer2 = customerService.saveCustomer(customer);
		if (customer2 != null) {
			System.out.println(customer2.getId() + "saved succesfully");

		}

	}

}
