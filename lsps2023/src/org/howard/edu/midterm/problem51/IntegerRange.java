package org.howard.edu.midterm.problem51;

public class IntegerRange implements Range {
    	private int lower;
   	private int upper;

	// Hint: implement getters for lower and upper

   	 IntegerRange(int lower, int upper) { 	// Constructor
        		this.lower = lower;
        		this.upper = upper;
   	 }
	public boolean contains(int value) {
		// implement
	}
public boolean overlaps(Range other) throws EmptyRangeException {
		// implement
	}

public int size()  {
		// implement
	}
}
