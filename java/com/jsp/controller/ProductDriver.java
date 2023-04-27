package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class ProductDriver {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("abc");
		product.setBrand("xyz");
		product.setStatus("UnChecked");

		ProductService productService = new ProductService();
		Product product2 = productService.saveStProduct(product);
		if (product2 != null) {
			System.out.println(product2.getId() + " saved succesfully");
		}
	}

}
