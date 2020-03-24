package com.book.page132;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class ProductDAOImpl2 extends JdbcDaoSupport implements ProductDAO {

	@Override
	public List<Product> findProductList() {
		// TODO Auto-generated method stub
		String sql ="select * from product";
		ProductRowMapper mapper = new ProductRowMapper();
		List<Product> products = getJdbcTemplate().query(sql, mapper);
		return products;
	}

}
