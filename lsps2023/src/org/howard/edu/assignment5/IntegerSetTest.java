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
	
	@Test
	void testlength() {
		set.add(5);
		set.add(10);
		set.add(15);
		set.add(20);
		set.add(25);
		assertTrue(set.length()== 5);
		
	}
	
	@Test
	void testcontains() {
		set.add(3);
		assertTrue(set.contains(3));
	}
	
	@Test
	void testclear() {
		set.add(1);
		set.clear();
		assertEquals(set.set.size(),0);
	}

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

}
