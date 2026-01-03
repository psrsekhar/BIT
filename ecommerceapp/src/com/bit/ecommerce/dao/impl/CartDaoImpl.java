package com.bit.ecommerce.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.ecommerce.dao.CartDao;
import com.bit.ecommerce.domain.Cart;
import com.bit.ecommerce.util.ConnectionPool;

public class CartDaoImpl implements CartDao {

	@Override
	public List<Cart> getAllByUserId(int userId) {
		List<Cart> cartItems = new ArrayList<>();
		ConnectionPool dataSource = ConnectionPool.getInstance();
		Connection connection = dataSource.getConnection();
		String query = "select * from cart where user_id=?";
		try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
			preparedStatement.setInt(1, userId);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				cartItems.add(new Cart(resultSet.getInt("cart_id"), resultSet.getInt("user_id"), resultSet.getInt("product_id"), resultSet.getInt("quantity")));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		dataSource.releaseConnection(connection);
		return cartItems;
	}

	@Override
	public void save(Cart cart) {
		ConnectionPool dataSource = ConnectionPool.getInstance();
		Connection connection = dataSource.getConnection();
		String query = "insert into cart(user_id, product_id, quantity) values (?, ?, ?)";
		try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
			preparedStatement.setInt(1, cart.getUserId());
			preparedStatement.setInt(2, cart.getProductId());
			preparedStatement.setInt(3, cart.getQuantity());
			preparedStatement.executeUpdate();
			System.out.println("Item is added to the cart");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
	}

}
