package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Customer;

public class CustomerDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Aniruddha");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Customer saveProduct(Customer customer) {

		entityTransaction.begin();
		entityManager.persist(customer);
		entityTransaction.commit();

		return customer;

	}

	public Customer getCustomerById(int id) {
		return entityManager.find(Customer.class, id);
	}

	public Customer updateCustomer(Customer customer) {

		if (customer != null) {
			entityTransaction.begin();
			entityManager.merge(customer);
			entityTransaction.commit();
			return customer;
		} else {
			return null;
		}
	}

	public void deleteCustomerById(int id) {

		Customer customer = entityManager.find(Customer.class, id);
		if (customer != null) {
			entityTransaction.begin();
			entityManager.remove(customer);
			entityTransaction.commit();

		}
	}

}