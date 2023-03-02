package org.howard.edu.assignment4;

/**
 * 
 * @author Amir Bredy
 *
 */

public class Driver {
	public static void main(String[] args) {
		//Testing set, Will throw exception
		IntegerSet EmptySet = new IntegerSet();
		//Initializing our three sets
		IntegerSet FirstSet = new IntegerSet();
		IntegerSet SecondSet = new IntegerSet();
		IntegerSet ThirdSet = new IntegerSet();
		
		// Function testing for our First Set
		FirstSet.add(62);
		FirstSet.add(93);
		FirstSet.add(15);
		FirstSet.add(23);
		FirstSet.add(35);
		
		// Function testing for our Second set
		SecondSet.add(2);
		SecondSet.add(3);
		
		// Function testing for our Third set
		ThirdSet.add(60);
		ThirdSet.add(100);
		ThirdSet.add(350);
		ThirdSet.add(600);
		
		//Print statements
		System.out.println("The value of FirstSet is: \n" + FirstSet.toString());
		System.out.println("The value of SecondSet is: \n" + SecondSet.toString());
		System.out.println("The value of setE is: \n" + EmptySet.toString());
		System.out.println("The value of ThirdSet is: \n" + ThirdSet.toString());

		// Function 1 test
		System.out.println("Does the First Set contains the number 1?: \n" + FirstSet.contains(1));
		
		//Testing length method with the sets
		System.out.println("Our populated Set size is: \n" + FirstSet.length());
		System.out.println("Our empty Set size is: \n" + EmptySet.length());
		
		// Testing smallest and largest methods with the sets
		System.out.println("The smallest value in our First Set is: \n" + FirstSet.smallest());
	
		System.out.println("The smallest value in our Empty Set is: \n" + EmptySet.smallest());
		System.out.println("The largest value in our First set is: \n" + FirstSet.largest());
		System.out.println("The largest value in our First set is: \n" + EmptySet.largest());
		
		// Testing the equals method with the sets
		System.out.println("Does the First set equal the Second set? \n" + FirstSet.equals(SecondSet));
		System.out.println("Does the First set equal the Third set? \n" + ThirdSet.equals(FirstSet));
		
		// Testing the intersect method with the sets
		System.out.println("First set before using intersect function: \n" + FirstSet.toString());
		System.out.println("Second set before using intersect function: \n" + SecondSet.toString());
		FirstSet.intersect(SecondSet);
		System.out.println("First set after using intersect function: \n" + FirstSet.toString());
		
		//Testing isEmpty on the sets
		System.out.println("Is our First Set empty? \n" + FirstSet.isEmpty());
		System.out.println("Is our Empty set empty? \n" + EmptySet.isEmpty());
		
		// Test Union function on our sets
		FirstSet.union(SecondSet);
		System.out.println("Our first set after using Union is: \n" + FirstSet.toString());
		
		// Test diff function on the sets
		FirstSet.diff(SecondSet);
		System.out.println("The value of our first set after using diff with FirstSet and SecondSet is: \n" + FirstSet.toString());

	};
};

	
