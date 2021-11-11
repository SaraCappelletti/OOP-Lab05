package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product {
	
	String name;
	double quantity;

	public ProductImpl(String name, double quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	/*Return the product name.*/@Override
	public String getName() {
		return this.name;
	}

	/*Return the amount of product.*/@Override
	public double getQuantity() {
		return this.quantity;
	}

}
