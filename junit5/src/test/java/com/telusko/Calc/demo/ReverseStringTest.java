package com.telusko.Calc.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseStringTest {
	
	ReverseString reverse = new ReverseString();

	@Test
	void testReverseString_OneWord() {
		//ReverseString reverse = new ReverseString();

		assertEquals("avaJ", reverse.reverseString("Java"));
	}

	@Test
	void testReverseString_MultipleWords() {
		//ReverseString reverse = new ReverseString();

		assertEquals("ysae si avaj", reverse.reverseString("java is easy"));

	}

}
