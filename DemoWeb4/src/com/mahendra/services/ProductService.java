package com.mahendra.services;

import java.util.LinkedList;
import java.util.List;

import com.mahendra.models.Product;

public class ProductService {

	private List<Product> products;
	
	public ProductService(){
		products = new LinkedList<Product>();
		
		Product p1 = new Product();
		p1.setName("dantkanti");
		p1.setDescription("Toothpaste");
		p1.setPrice(42);
		
		Product p2 = new Product();
		p2.setName("Coalgate");
		p2.setDescription("Toothpaste");
		p2.setPrice(40);
		
		products.add(p1);
		products.add(p2);
		
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public void add(Product p){
		products.add(p);
	}
}
