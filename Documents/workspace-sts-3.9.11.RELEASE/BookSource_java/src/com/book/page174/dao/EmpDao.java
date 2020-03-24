package com.book.page174.dao;

import java.util.List;

import com.book.page174.Product;

public interface EmpDao {
	List<Product> findProductList();

	Product findProduct(int id);

	List<Product> findProductPrice(int price);
}
