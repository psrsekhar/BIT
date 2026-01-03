package com.bit.ecommerce.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bit.ecommerce.dao.ProductDao;
import com.bit.ecommerce.domain.Product;
import com.bit.ecommerce.util.ConnectionPool;

public class ProductDaoImpl implements ProductDao {

	@Override
	public List<Product> getAll() {
		List<Product> products = new ArrayList<>();
		ConnectionPool dataSource = ConnectionPool.getInstance();
		Connection connection = dataSource.getConnection();
		try (Statement statement = connection.createStatement()) {
			ResultSet resultSet = statement.executeQuery("select * from products");
			while (resultSet.next()) {
				Product product = new Product();
				product.setProductId(resultSet.getInt("product_id"));
				product.setName(resultSet.getString("name"));
				product.setDescription(resultSet.getString("description"));
				product.setPrice(resultSet.getDouble("price"));
				product.setStockQuantity(resultSet.getInt("stock_quantity"));
				products.add(product);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		dataSource.releaseConnection(connection);
		return products;
	}
}
