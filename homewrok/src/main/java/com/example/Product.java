/**
 * @author Van Trinh
 * @since 02/23/2022 exercise 4 Define and implement an immutable class Product
 *        that contain fields for product name, product description, product
 *        price, maximum quantity allowed to be ordered. Create getters for all
 *        its attributes. This class also need a fully parameterized
 *        constructor. This class overrides Object’s implementation of
 *        toString()method.
 */


package com.example;

public final class Product {
	private String name;
	private String description;
	private double price;
	private double maxQuantity;

	//Constructor 
	/**
	 * Constructor Product 
	 * @param name The Product's name
	 * @param description The Product's description
	 * @param price The Product's price
	 * @param maxQuantity the Product maxQuantity	 
	 */
	 public Product(String name, String description, double price, double maxQuantity) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.maxQuantity = maxQuantity;
	}
	 //Setter and Getter
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setMaxQualt(double maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

	public double getMaxQualt() {
		return maxQuantity;
	}

	@Override
	public String toString() {
		return name + ": " + description + " " + price + " " + maxQuantity;
	}

}
