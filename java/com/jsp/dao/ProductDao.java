package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Product;

public class ProductDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Aniruddha");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Product saveProduct(Product product) {

		if (product != null) {
			entityTransaction.begin();
			entityManager.persist(product);
			entityTransaction.commit();
			return product;
		} else {
			return null;
		}
	}

	public Product getProductById(int id) {
		return entityManager.find(Product.class, id);
	}

	public Product updateProduct(Product product) {

		if (product != null) {
			entityTransaction.begin();
			entityManager.merge(product);
			entityTransaction.commit();
			return product;
		} else {
			return null;
		}
	}
	
	
	public void deleteProductById(int id) {
		
		Product product = entityManager.find(Product.class, id);
		if (product != null) {
			entityTransaction.begin();
			entityManager.remove(product);
			entityTransaction.commit();
			
		}
	}
	
}
