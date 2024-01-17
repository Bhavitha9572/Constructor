package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShaesTest {
	
	Shapes shape =new Shapes();

	@Test
	void testcomputeSquareArea() {
		
		//Shapes shape =new Shapes();
		//assertEquals(576,shape.computeSquareArea(24));
		
		assertNotEquals(5765,shape.computeSquareArea(24));
	}
	
	
	@Test
	void testComputerCircleArea() {
		assertEquals(78.5,shape.computerCircleArea(5),"area of circle is not correct assumption");
	}
	
	@Test
	void testComputerCircleArea_supplier() {
		assertEquals(78.5,shape.computerCircleArea(5),()->"area of circle is not correct assumption");
	}
	
	@Test
	void test() {
		String str ="Junit";
		assertTrue(str.equals("Junit"));
	}

}
