package org.howard.edu.midterm.problem51;

import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.midterm.problem51.Range.EmptyRangeException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class IntegerRangeTest {

	IntegerRange rangetest;
	
	@BeforeEach
	void setUp() throws Exception {
		rangetest = new IntegerRange(0, 100);
	}

	@AfterEach
	void tearDown() throws Exception {
		rangetest = null;
	}
	
    @Test
    public void testContains() {
        assertTrue(rangetest.contains(50));
        assertFalse(rangetest.contains(101));
    }

    @Test
    public void testOverlaps() throws EmptyRangeException {
        IntegerRange range2 = new IntegerRange(50, 150);
        assertTrue(rangetest.overlaps(range2));
        assertFalse(rangetest.overlaps(new IntegerRange(101, 200)));
    }

    @Test
    public void testSize() {
        assertEquals(101, rangetest.size());
    }
    
    @Test
    @DisplayName("Testing uppergetter")
    void testuppergetter() {
    	assertEquals(rangetest.uppergetter(), 100);
    }
    
    @Test
    @DisplayName("Testing uppergetter")
    void testlowergetter() {
    	assertEquals(rangetest.lowergetter(), 0);
    }
}