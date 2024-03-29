package org.howard.edu.midterm.problem51;

public interface Range { 
	
   	public class EmptyRangeException extends RuntimeException {
        public EmptyRangeException() {
            super("Our Range can't be empty");
        }
    }
   	
public boolean contains(int value);  
    // returns true if v is ≥ lower bound and ≤ upper bound, 
    // and false otherwise 
public boolean overlaps(Range other) throws EmptyRangeException; 

    // returns true if the receiver contains at least 
    // one value in common with other, and false otherwise 
    //  EmptyRangeException is thrown when a null Range object is passed to the method

public int size(); 

    // returns the number of integers in the range

public int lowergetter();

public int uppergetter();

}
