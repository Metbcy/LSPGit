package org.howard.edu.assignment5;

/**
 * @author Amir Bredy
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.util.Arrays;
import java.util.ArrayList;

class IntegerSetTest {
	
	IntegerSet set;
	
	@BeforeEach
	void setUp() throws Exception {
		set = new IntegerSet();
	}
	
	@AfterEach
	void tearDown() throws Exception {
		set = null;
	}
	
	/**
	 * Test for length function
	 */
	@Test 
	void testlength() {
		set.add(5);
		set.add(10);
		set.add(15);
		set.add(20);
		set.add(25);
		assertTrue(set.length() == 5);
		
	}
	
	/**
	 * Test for contains function
	 */
	@Test
	void testcontains() {
		set.add(3);
		assertTrue(set.contains(3));
	}
	
	/**
	 * Test for largest function
	 */
	
	@Test
	void testlargest() {
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		assertTrue(set.largest() == 400);
	}
	
	/**
	 * Test for smallest function
	 */
	
	@Test
	void testsmallest() {
		set.add(0);
		set.add(10);
		set.add(15);
		set.add(20);
		assertTrue(set.smallest() == 0);
	}
	
	/**
	 * Test for clearing function
	 */
	
	@Test
	void testclear() {
		set.add(1);
		set.clear();
		assertEquals(set.set.size(),0);
	}
	
	/**
	 * Test for equal function
	 */
	
	@Test
	void testequal() {
		IntegerSet SetList = new IntegerSet();
		SetList.add(10);
		set.add(10);
		assertTrue(set.equals(SetList));
	}
	
	/**
	 * Test for adding function
	 */
	
	@Test
	void testadd() {
		ArrayList <Integer> SetList = new ArrayList <Integer>();
		SetList.add(20);
		SetList.add(40);
		SetList.add(60);
		
		set.add(20);
		set.add(40);
		set.add(60);
			
		assertTrue(SetList.equals(set.set));
	}
	
	/**
	 * Test for removal function
	 */
	
	@Test
	void testremove() {
		set.add(20);
		set.add(40);
		set.add(60);
		set.remove(40);
		assertFalse(set.contains(40));
	}
	
	/**
	 * Test for union function
	 */
	
	@Test
	void testunion() {
		set.add(5);
		set.add(10);
		set.add(15);
		IntegerSet SecondSet = new IntegerSet();
		SecondSet.add(20);
		SecondSet.add(25);
		SecondSet.add(30);
		set.union(SecondSet);
		assertEquals(set.set, new ArrayList<Integer>(Arrays.asList(5, 10, 15, 20, 25, 30)));
	}
	
	/**
	 * Test for intersection function
	 */
	
	@Test
	void testintersect() {
		IntegerSet SecondSet = new IntegerSet();
		set.add(5);
		set.add(10);
		set.add(15);

		SecondSet.add(10);
		SecondSet.add(25);
		SecondSet.add(15);
		
		set.intersect(SecondSet);
		assertEquals(set.set, new ArrayList<Integer>(Arrays.asList(10,15)));
	}
	
	/**
	 * Test for difference function
	 */
	
	@Test
	void testdiff() {
		set.add(5);
		set.add(10);
		set.add(15);

		IntegerSet SecondSet = new IntegerSet();
		SecondSet.add(5);
		SecondSet.add(10);
		SecondSet.add(35);
		ArrayList <Integer> SetList = new ArrayList<Integer>(Arrays.asList(15));
		set.diff(SecondSet);
		assertEquals(set.set, SetList);
	}
	
	/**
	 * Test for empty function
	 */
	
	@Test
	void testempty() {
		assertTrue(set.isEmpty());
	}
	
	/**
	 * Test for string function
	 */
	
	@Test
	void stringtest() {
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		
		assertEquals(set.toString(), "[10, 20, 30, 40]");
	}
}
