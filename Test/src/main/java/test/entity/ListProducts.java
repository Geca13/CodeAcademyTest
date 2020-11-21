package main.java.test.entity;

import java.util.List;

public class ListProducts {

    private ShoppingCart cart;
	
	private List<Product> products;

	public ShoppingCart getCart() {
		return cart;
	}

	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
