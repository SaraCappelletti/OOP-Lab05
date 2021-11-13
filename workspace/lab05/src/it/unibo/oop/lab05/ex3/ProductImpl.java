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

    /**
     * {@inheritDoc}
     */
    public boolean equals(final Object obj) {
        if (obj instanceof Product) {
            final var pr = (Product) obj;
            return name.equals(pr.getName());
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public final String toString() {
        return "ProductImpl [name=" + name + ", quantity=" + quantity + "]";
    }

	
}
