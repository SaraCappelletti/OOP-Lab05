package it.unibo.oop.lab05.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {    	
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         */
    	final Collection<String> tree = new TreeSet<String>();
        /* 2) Populates such Collection with all the Strings ranging from "1" to
        * "20"
        */ 
    	for (int i = 0; i < 20; i++) {
    		tree.add(Integer.toString(i)); /*(int) (i * Math.random() * 1000))*/
    	}
        /* 3) Prints its content
        */
    	System.out.println(tree);
    	/* 4) Removes all those strings whose represented number is divisible by
        * three
        */
    	final var iterator = tree.iterator();
    	while (iterator.hasNext()) {
    		if (Integer.parseInt(iterator.next()) % 3 == 0) {
    			iterator.remove();
    		}
    	}
        /* 5) Prints the content of the Set using a for-each costruct
        */
    	for (String elem : tree) {
    		System.out.println(elem);
    	}
        /* 6) Verifies if all the numbers left in the set are even
        */
    	for (String elem : tree) {
    		if (Integer.parseInt(elem) % 2 != 0) {
    			System.out.println("All the numbers left in the set are NOT even");
    			return;
    		}
    	}

    }
}
