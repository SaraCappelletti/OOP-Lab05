package it.unibo.oop.lab05.ex5;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 */
public final class Utilities {

    private Utilities() { }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the union of the input sets.
     */
    public static <X> Set<X> setUnion(final Set<? extends X> setA, final Set<? extends X> setB) {
    	final Set<X> union = new HashSet<X>();
    	for (X elem : setA) {
    		union.add(elem);
    	}
    	for (X elem : setB) {
    		union.add(elem);
    	}
    	return union;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the intersection of the input sets.
     */
    public static <X> Set<X> setIntersection(final Set<? extends X> setA, final Set<? extends X> setB) {
    	final Set<X> intersection = new HashSet<X>();
    	for (X elemA : setA) {
    		for (X elemB : setB) {
    			if(elemA.equals(elemB)) {
    				intersection.add(elemA);
    			}
    		}
    	}
    	
    	return intersection;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the symmetric difference of the input sets.
     */
    public static <X> Set<X> setSymmetricDifference(final Set<? extends X> setA, final Set<? extends X> setB) {
    	/* PERCHE' SONO UNA CRETINA 
    	final Set<X> difference = new HashSet<X>();
    	Set<X> union = new HashSet<X>();
    	boolean equal = false;
    	union = setUnion(setA, setB);
    	for (X elemA : union) {
    		for (X elemB : setB) {
    			if(elemA.equals(elemB)) {
    				equal = true;
    			}
    		}
    		for (X elemB : setA) {
    			if(elemA.equals(elemB)) {
    				equal = true;
    			}
    		}
    		if (equal != true) {
    			difference.add(elemA);
    			
    		}
    		else {
    			equal = false;
    		}
    	}
    	
    	return difference;*/
    	
    	final var res = setUnion(setA, setB);
        res.removeAll(setIntersection(setA, setB));
        return res;
    }

    /**
     * @param coll
     *            the collection
     * @param <X>
     *            collection type
     * @return a random element from the collection
     *
     */
    public static <X> X getRandomElement(final Collection<X> coll) {
        int n = new Random().nextInt(coll.size());
        for (final X x : coll) {
            if (n == 0) {
                return x;
            }
            n--;
        }
        return null;
    	/*final X f = (getRandomElement(coll));
    	return f;*/
    }

    /**
     * @param first
     *            first collection
     * @param second
     *            second collection
     * @param <X>
     *            First collection type
     * @param <Y>
     *            Second collection type
     * @return a pair with two random elements
     */
    public static <X, Y> Pair<X, Y> getRandomPair(final Collection<X> first, final Collection<Y> second) {
    	return new Pair<>(getRandomElement(first), getRandomElement(second));
    }
}
