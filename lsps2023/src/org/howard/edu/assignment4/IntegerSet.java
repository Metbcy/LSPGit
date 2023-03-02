package org.howard.edu.assignment4;

import java.util.*; 
/** 
 * 
 * @author Amir Bredy
 *
 */

public class IntegerSet {
	// Creating an Exception class
    private class IntegerSetException extends Exception {
        IntegerSetException(String str){
            super(str);
        }
    }
    
    private ArrayList<Integer> set = new ArrayList<>();
    
    public IntegerSet() {}
    
    // Clearing the set
    public void clear() {
        set.clear();
    }
    // function to return the length of a set
    public int length(){
        return set.size();
    }
    // Boolean func that returns true if two sets are equal
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
    // Boolean func that returns true if a set contains a value, will take an integer.
    public boolean contains(int value) {
        return set.contains(value);
    }
    
	// Function that returns the largest integer in the set
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
		    IntegerSetException emptySet = new IntegerSetException("This set is empty, we can't return the largest element");
		    throw emptySet;
			}
		} 
		catch (IntegerSetException emptySet){  
			emptySet.printStackTrace();
		}
		
		return 10000;
	}; 
	
	// Function that returns the smallest integer in the set
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
		    IntegerSetException emptySet = new IntegerSetException("This set is empty, we can't return the smallest element");
		    throw emptySet;
			}
		} 
		catch (IntegerSetException emptySet){  
			emptySet.printStackTrace();
		}
		return 0;
	};
	
	// Function to add an integer to the set
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }
    
    // Function to remove an integer to the set
    public void remove(int item) {
        if (set.contains(item)){
            set.remove(Integer.valueOf(item));
        }
    }
    // Function to find the union of the current set and another set
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
    // Function to find the intersection of the current set and another set
    public void intersect(IntegerSet other) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < set.size(); i++) {
            if (other.set.contains(set.get(i))) {
                temp.add(set.get(i));
            }
        }
        set = temp;
    }
    // Function to find the difference of the current set and another set
    public void diff(IntegerSet other) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < set.size(); i++) {
            if (!other.set.contains(set.get(i))) {
                temp.add(set.get(i));
            }
        }
        set = temp;
    }
    // Function to find whether a set is empty
    public boolean isEmpty() {
        return set.isEmpty();
    }
    // Returns the string representation of the IntegerSet
    public String toString() {
        return set.toString();
    }
}
