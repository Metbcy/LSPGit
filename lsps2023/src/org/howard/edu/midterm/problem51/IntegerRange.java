package org.howard.edu.midterm.problem51;


public class IntegerRange implements Range {
    private int lower;
   	private int upper;
   	
   	public class EmptyRangeException extends RuntimeException {
        public EmptyRangeException() {
            super("Our Range can't be empty");
        }
    }

	// Hint: implement getters for lower and upper

   	 IntegerRange(int lower, int upper) { 	// Constructor
        		this.lower = lower;
        		this.upper = upper;
   	 }
   	//getter functions
   	public int uppergetter() {
   		return upper;
   	}
   	
   	public int lowergetter() {
   		return lower;
   	}
   	
   	
    public boolean contains(int value) {
        // returns true if v is ≥ lower bound and ≤ upper bound, 
        // and false otherwise 
        return value >= lower && value <= upper;
    }
    
    
    public boolean overlaps(Range other) throws EmptyRangeException {
        // returns true if the receiver contains at least 
        // one value in common with other, and false otherwise 
        // EmptyRangeException is thrown when a null Range object is passed to the method
        if (other == null) {
            throw new EmptyRangeException();
        }
        return (this.contains(other.lowergetter()) || this.contains(other.uppergetter())) &&
                (other.contains(this.lowergetter()) || other.contains(this.uppergetter()));
}

    public int size()  {
	return uppergetter() - lowergetter();
	}
}
