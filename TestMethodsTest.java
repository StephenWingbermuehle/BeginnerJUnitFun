package com.stephen.methods.playTests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMethodsTest {

	//private static final TestMethods test = new TestMethods();
	
	/*
	 * 1. Square Math
	 */
	@Test
	public void testSquare() {
		assertEquals(25, TestMethods.square(5));
	}
	
	/*
	 * 2. Letter Occurrence
	 */
	@Test
	public void testA() {
		assertEquals(1, TestMethods.occurA("A"));
	}
	
	@Test
	public void testUppercaseAndLowercase() {
		assertEquals(3, TestMethods.occurA("Alphabetical"));
	}

	/*
	 * 3. Square or Rectangle
	 */
	@Test
	public void isSquare() {
		assertEquals("square", TestMethods.squareOrRectangle(1,1,1,1));
	}
	
	@Test
	public void isRectangle() {
		assertEquals("rectangle", TestMethods.squareOrRectangle(2, 2, 3, 2));
	}
	
	/*
	 * 4. Reverse Words in a String
	 */
	@Test
	public void isReversed() {
		assertEquals("blue is sky the", TestMethods.reverseWords("the sky is blue"));
	}
	
	@Test
	public void isReversedWithCapitals() {
		assertEquals("World Hello", TestMethods.reverseWords("Hello World"));
	}
	
	@Test
	public void isReverseOneWord() {
		assertEquals("Single", TestMethods.reverseWords("Single"));
	}
	
	/*
	 * 5. Reverse the letters
	 */
	@Test
	public void isReverseLetters() {
		assertEquals("elpmaxE", TestMethods.reverseLetters("Example"));
	}
	
	@Test
	public void isReverseTwoWordsLetters() {
		assertEquals("elpmaxE sihT", TestMethods.reverseLetters("This Example"));
	}
	
	@Test
	public void isReverseOneLetter() {
		assertEquals("A", TestMethods.reverseLetters("A"));
	}
	
	/*
	 * 6. UpperCase
	 */
	@Test
	public void isUpperCase() {
		assertEquals("REVATURE", TestMethods.allCaps("revature"));
	}
	
	@Test
	public void isUpperCaseLetter() {
		assertEquals("A", TestMethods.allCaps("a"));
	}
	
	@Test
	public void isUpperCaseMix() {
		assertEquals("R3VATUR3", TestMethods.allCaps("r3vatur3"));
	}
	
	/*
	 * 7. Triangles
	 */
	@Test
	public void isEquilateral() {
		assertEquals("Equilateral", TestMethods.whatTriangle(8, 8, 8));
	}
	
	@Test
	public void isIsosceles() {
		assertEquals("Isosceles", TestMethods.whatTriangle(9, 8, 8));
	}
	
	@Test
	public void isScalene() {
		assertEquals("Scalene", TestMethods.whatTriangle(5, 6, 10));
	}
	
	/*
	 * 8. other letter is capitalized
	 */
	@Test
	public void isSmallWord() {
		assertEquals("ThE", TestMethods.capitalizeOther("the"));
	}
	
	@Test
	public void isBigWord() {
		assertEquals("TeLePhOnE", TestMethods.capitalizeOther("telephone"));
	}
	
	@Test
	public void oneLetter() {
		assertEquals("H", TestMethods.capitalizeOther("h"));
	}
	
	/*
	 * 9. Capitalize other letter better
	 */
	@Test
	public void isSmallerWord() {
		assertEquals("ThReE", TestMethods.capitalizeOtherBetter("THrEE"));
	}
	
	@Test
	public void isBiggerWord() {
		assertEquals("SpInAcH", TestMethods.capitalizeOtherBetter("spinACH"));
	}
	
	/*
	 * 10. Change multiple words in a string better
	 */
	@Test
	public void isOneWord() {
		assertEquals("MaNy", TestMethods.capitalizeOtherWordsBetter("many"));
	}
	
	@Test
	public void isFewWords() {
		assertEquals("MaNy WoRdS HaVe ChAnGeD", TestMethods.capitalizeOtherWordsBetter("many words have changed"));
	}
	
	@Test
	public void isWeirdWords() {
		assertEquals("MaNy WeIrD WoRdS HaVe ChAnGeD", TestMethods.capitalizeOtherWordsBetter("many WEIRD worDS HAve cHaNgEd"));
	}
}
