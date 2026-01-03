package com.bit.ecommerce;

import java.util.List;
import java.util.Scanner;

import com.bit.ecommerce.controller.CartController;
import com.bit.ecommerce.controller.ProductController;
import com.bit.ecommerce.controller.UserController;
import com.bit.ecommerce.domain.Cart;
import com.bit.ecommerce.domain.Product;
import com.bit.ecommerce.domain.User;

public class ECommerceApp {
	Scanner scanner = new Scanner(System.in);
	UserController userController = new UserController();
	ProductController productController = new ProductController();
	CartController cartController = new CartController();
	
	public static void main(String[] args) {
		new ECommerceApp().start();
	}

	public void start() {
		System.out.println("Welcome to E-Commerce Application");
		System.out.println(
				" 1. Register\n 2. Login\n 3. View Products\n 4. Add to Cart\n 5. View Cart\n 6. Checkout\n 7. Order History\n 8. Logout");

		System.out.println("Enter your choice");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			register();
			break;
		case 2:
			login();
			break;
		case 3:
			viewProducts();
			break;
		case 4:
			addToCart();
			break;
		case 5:
			viewCart();
			break;
		case 6:
			checkout();
			break;
		case 7:
			viewHistory();
			break;
		case 8:
			logout();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}
	
	private void register() {
		System.out.println("Enter user details");
		String userDetails = scanner.next();
		userController.register(userDetails);
	}

	private void login() {
		System.out.println("Enter username");
		String username = scanner.next();
		System.out.println("Enter password");
		String password = scanner.next();
		userController.login(new User(username, password));
	}

	private void viewProducts() {
		List<Product> products = productController.getProducts();
		products.stream().forEach(System.out::println);
	}

	private void addToCart() {
		System.out.println("Enter user id");
		int userId = scanner.nextInt();
		System.out.println("Enter product id");
		int productId = scanner.nextInt();
		System.out.println("Enter quantity");
		int quantity = scanner.nextInt();
		cartController.addToCart(userId, productId, quantity);
	}

	private void viewCart() {
		System.out.println("Enter user id");
		int userId = scanner.nextInt();
		List<Cart> cartItems = cartController.getCartItems(userId);
		cartItems.stream().forEach(System.out::println);
	}

	private void checkout() {
		throw new UnsupportedOperationException();
	}

	private void viewHistory() {
		throw new UnsupportedOperationException();
	}

	private void logout() {
		throw new UnsupportedOperationException();
	}
}
