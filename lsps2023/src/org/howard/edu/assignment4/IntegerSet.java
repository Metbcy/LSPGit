package org.howard.edu.assignment4;

import java.util.*; 

public class IntegerSet  {
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> set = new ArrayList<Integer>();

	// Default Constructor
	public IntegerSet() {
	}

	// Clears the internal representation of the set
public void clear() {…};

// Returns the length of the set
public int length() {…}; // returns the length

/*
              * Returns true if the 2 sets are equal, false otherwise;
 * Two sets are equal if they contain all of the same values in ANY order.
*/
public boolean equals(IntegerSet b) {…}; 

// Returns true if the set contains the value, otherwise false
public boolean contains(int value) {…};    

// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
public int largest()  {…}; 

// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
public int smallest()  IntegerSetException {…};

	// Adds an item to the set or does nothing it already there	
 	public void add(int item) {…}; // adds item to the set or does nothing if it is in set

	// Removes an item from the set or does nothing if not there
public void remove(int item) {…}; 

// Set union
public void union(IntegerSet intSetb) {…};

// Set intersection
public void intersect(IntegerSet intSetb) {…}; 

// Set difference, i.e., s1 –s2
public void diff(IntegerSet intSetb); // set difference, i.e. s1 - s2

// Returns true if the set is empty, false otherwise
boolean isEmpty(); 

// Return String representation of your set
public String toString() {…};	// return String representation of your set
}
