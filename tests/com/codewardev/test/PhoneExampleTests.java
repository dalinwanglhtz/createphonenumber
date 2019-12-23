package com.codewardev.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.codewardev.Kata;

class PhoneExampleTests {

	@Test
	  public void tests() {
	    assertEquals("(123) 456-7890", Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
	  }

}
