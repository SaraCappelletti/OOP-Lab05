package it.unibo.oop.lab05.ex3;

import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class WarehouseImpl implements Warehouse{
	
	Set<Product> prod = new HashSet<>();
	
	public WarehouseImpl() {
		this.prod = null;
	}

	/*Adds a product, assuming there is no other with same name already there.*/@Override
	public void addProduct(Product p) {
		prod.add(p);
	}

	/*This method allows to get all the registered product names. It can be
     * used safely. Return a collection of all registered products names.*/@Override
	public Set<String> allNames() {
    	final Set<String> list = new HashSet<>();
    	for (Product elem : prod) {
    		list.add(elem.getName());
    	}
		return list;
	}

     /* This method allows to get all the registered products. It can be used
      * safely. Return a collection of all registered products.*/@Override
	public Set<Product> allProducts() {
		return prod;
	}

      /*This method checks whether a product is stored in the Warehouse. 
       * It must run in constant time.
       * Return true if the Warehouse contains the Product.*/@Override
	public boolean containsProduct(Product p) {
    	   boolean answer = false;
    	   for (Product elem : prod) {
    		   if(elem.getName() == p.getName()) {
    			   answer = true;
    		   }
    		   else{
    	   			answer = false;
    	   			}
    	   }
		return answer;  		
	}

	/*Given a product, returns the amount of the product with that name,
	 * or -1 if it is not there.*/@Override
	public double getQuantity(String name) {
		double answer = 0;
		for (Product elem : prod) {
			if (elem.getName() == name) {
				answer = elem.getQuantity();
			}
		}
		return answer;
	}

}
