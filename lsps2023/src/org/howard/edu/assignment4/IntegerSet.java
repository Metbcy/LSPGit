package org.howard.edu.assignment4;

import java.util.*; 
/** 
 * Creation of the IntegerSet Data Structure
 * 
 * @author Amir Bredy
 *
 */

public class IntegerSet {
	/** 
	* Creating an Exception class
	*/
    private class IntegerSetException extends Exception {
        IntegerSetException(String str){
            super(str);
        }
    }
    
    /**
     * creating an array
     */
    
    private ArrayList<Integer> set = new ArrayList<>();
    
    /**
     * This will be our default constructor
     */
    public IntegerSet() {}
    
	/** 
	* function to clear the set
	*/
    
    public void clear() {
        set.clear();
    }
    
	/** 
	* function to return the length of a set
	* @return size of the set
	*/
    public int length(){
        return set.size();
    }
    /**
     * @param IntegerSet
     * @return true if two sets are equal
     */
    public boolean equals(IntegerSet other) {
        if (set.size() != other.set.size()) {
            return false;
        }
        //for loop to compare sets
        for (int i = 0; i < other.set.size(); i++) {
            if (!set.contains(other.set.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * 
     * @param value
     * @return true if a set contains a value
     */
    public boolean contains(int value) {
        return set.contains(value);
    }
    
    /**
     * Finds the largest element in the set.
     * 
     * @return The largest element in the set, or throws an exception if the set is empty/returns 10000.
     */
    
	public int largest()  {
		int max = 0;
		try {
			for (int i = 0; i< set.size(); i++) {
				if (set.get(i) > max) {
					max = set.get(i);
				}
			}
			if (set.size() > 0) {
				return max;
			}
			else {
		    IntegerSetException emptySet = new IntegerSetException("This set is empty a largest element cannot be returned");
		    throw emptySet;
			}
		} 
		catch (IntegerSetException emptySet){  
			emptySet.printStackTrace();
		}
		
		return 10000;
	}; 
	
    /**
     * Finds the smallest element in the set.
     * 
     * @return The smallest element in the set, or throws an exception if the set is empty.
     */
	
	public int smallest() {
		int min = 0;
		try {
			for (int i = 0; i< set.size(); i++) {
				if (set.get(i) < min) {
					min = set.get(i);
				}
			}
			if (set.size() > 0) {
				return min;
			}
			else {
		    IntegerSetException emptySet = new IntegerSetException("This set is empty a smallest element cannot be returned");
		    throw emptySet;
			}
		} 
		catch (IntegerSetException emptySet){  
			emptySet.printStackTrace();
		}
		return 0;
	};
	
    /**
     * Adds an element from the set.
     * @param item The integer to remove from the set.
     */
	
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }
    
    /**
     * Removes an element from the set.
     * @param item 
     */
    
    public void remove(int item) {
        if (set.contains(item)){
            set.remove(Integer.valueOf(item));
        }
    }
    
    /** 
     * Function to find the union of the current set and another set
     * @param IntegerSet
     */   
    public void union(IntegerSet other) {
        assert set.size() > 0 && other.set.size() > 0;
        ArrayList<Integer> temp = new ArrayList<>(set);
        for (int i = 0; i < other.set.size(); i++) {
            if (!temp.contains(other.set.get(i))) {
                temp.add(other.set.get(i));
            }
        }
        set = temp;
    }
    
    /** 
     * Function to find the intersection of the current set and another set
     * @param IntegerSet
     */
    public void intersect(IntegerSet other) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < set.size(); i++) {
            if (other.set.contains(set.get(i))) {
                temp.add(set.get(i));
            }
        }
        set = temp;
    }
    
    /** 
     * Function to find the difference of the current set and another set
     * @param IntegerSet
     */
    public void diff(IntegerSet other) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < set.size(); i++) {
            if (!other.set.contains(set.get(i))) {
                temp.add(set.get(i));
            }
        }
        set = temp;
    }
    
    /** 
     * Function to find whether a set is empty
     * @return whether if a set is empty or not
     */
    
    public boolean isEmpty() {
        return set.isEmpty();
    }
    
    /** 
     * @return the string representation of the IntegerSet
     */
    public String toString() {
        return set.toString();
    }
}
