package com.stephen.methods.playTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMethods {

	/*
	 * 
	 * Who is this for?
	 * - this is for anyone who might be thinking about learning Java,
	 * 		or someone who wants to understand methods, or someone
	 * 		who wants to learn a little more about JUnit testing.
	 * - this is pretty basic and not overly complicated.
	 * - I hope it helps folks practice writing methods and learn about problem solving.
	 * 
	 * Note: Before starting, you might want to comment out or delete all the answers
	 * - I went ahead and wrote methods for all the tests.
	 * - You'll have to erase these methods and write new ones.
	 * 
	 * 
	 * Instructions:
	 * 
	 * Only write methods in this file. DO NOT write methods in other file called TestMethodsTest.java or you will break it.
	 * The method signature is already given and YOU SHOULD NOT CHANGE ANYTHING ALREADY WRITTEN DOWN.
	 * Only add the method block (the logic for the method) underneath the method signature line and between the two curly braces.
	 * 
	 * Example:
	 * 
	 * public static int nameOfMethod(int number) { <------- do not touch these lines like this
	 * 
	 * 		*this is where you write stuff*
	 * 
	 * }	<------- do not touch this curly brace either
	 * 
	 * 
	 * Hopefully, that sounds easy enough.
	 * 
	 * To figure out if you have written a good method that works....
	 * 	- make sure you don't have any errors or exceptions that keep you from running the code
	 * 	- look at the file called TestMethodsTest.java
	 * 	- this is where the tests are.
	 * 	- DO NOT EDIT THIS FILE or you will break it.
	 * 	- Go into the file and left-click on the method signature of the test you would like to run.
	 * 	- The test will either pass (green color bar) or fail (red color bar) if the test fails.
	 * 	- there are a total of 25 tests to run in that file.
	 * 	- there are only 10 questions here.
	 * 	- That is to say that some questions here have multiple tests in the other file.
	 * 	- Try to get all 25 tests to pass if you can.
	 * 
	 * 
	 * The tests look like this....again, DO NOT edit them.
	 * 
	 * @Test
	 *	public void testSquare() {						<---------- just left-click on the word 'testSquare' then run the test.
	 *		assertEquals(25, TestMethods.square(5));
	 *	}
	 *
	 *	This test expects to receive a number 25 in return if a number 5 was passed through the method and went through the written logic.
	 *	The name of the method is called 'square' not 'testSquare'
	 *	The test is testing the method called 'square' by passing in the number five.
	 *	The test will pass (green color bar will appear) if it runs through the method and gets the number 25 back.
	 *
	 *
	 *
	 * Advice:
	 * Read the problem first.
	 * Then look at the test(s) for the problem in the TestMethodsTest.java file so you can see what it will give and what it expects after running through the method
	 * Then come back to this file and try writing a method that will pass the test(s).
	 * Once you think you have a good method that will work, go to the other file and left-click on the test(s) and run them.
	 * If the test is green, move on to the next one.
	 * If the test is red, then your method is bad and you need to change something.
	 * To help you figure out what you need to change, look at the failure trace and see what it says. Sorry this is vague, but it could say anything.
	 * Use Google and StackOverflow.com to help you as well as any other resources if you get stumped.
	 * Feel free to skips problems that are kind of hard for you.
	 * I think #8, 9, and 10 all kind of build off each other. Try to do those in a row if you can.
	 * 
	 * 
	 * Important!
	 * You must save this file every time whenever you've made changes before you want to run any tests in the other file.
	 * TL;DR Save before testing.
	 * 
	 * 
	 * That's it. Good luck.
	 */
	/*
	 * 1. Square Math
	 * 	Write a method that returns the square of a number.
	 * 	Example: Number 5 returns 25, because 5 times 5 is 25.
	 */
	public static int square(int x) {
		//I went ahead and solved this first one for you. Use this as a template for running your other tests.
		//There's more than one way to solve ALL of these methods.
		
		//this is one way...
		
//		int y each x*x;
//		return y;
		
		//here is another...
		return x*x;
	}
	
	/*
	 * 2. Letter Occurrence
	 * 	Write a method that returns the occurrence of the letter A/a.
	 * 	Example: The word "Alligator" would return 2 because there is one 'A' and one 'a' in the word.
	 */
	public static int occurA(String s) {
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='A') {
				count++;
			}
		}
		return count;
	}
	
	/*
	 * 3. Is it a square or rectangle?
	 * 	Given the length of the different sides of a shape,
	 * 	Determine if it is a rectangle or a square.
	 * 	Example: 4, 4, 4, 4 is a square.
	 */
	public static String squareOrRectangle(int a, int b, int c, int d) {
		if(a == b && b == c && c == d) {
			return "square";
		} else {
			return "rectangle";
		}
	}
	
	/*
	 * 4. Reverse word order in a string
	 * 	Given a string. write a method that will reverse,
	 *  the order of the words in the string.
	 *  Example: "the sky is blue = "blue is sky the"
	 */
	public static String reverseWords(String s) {
		String[] words = s.split("\\s");
		String outputString = "";
		for(int i = words.length-1; i>=0; i--) {
			outputString = outputString + words[i] + " ";
		}
		return outputString.trim();
	}
	
	/*
	 * 5. Reverse the letters in a string.
	 * 	Given a string. Write a method that will reverse,
	 * 	the order of the letters in the string.
	 * 	Example: "Example" = "elpmaxE"
	 */
	public static String reverseLetters( String s) {
		char[] reversed = new char[s.length()];
		for (int i = reversed.length - 1, j=0; i >= 0; i--, j++) {
			reversed[j] = s.charAt(i);
		}
		return new String(reversed);
	}
	
	/*
	 * 6. All caps
	 * 	Given a string, make all the letters into uppercase form.
	 * 	Example: "revature" = "REVATURE"
	 */
	public static String allCaps(String s) {
		return s.toUpperCase();
	}
	
	/*
	 * 7. Type of triangle.
	 * 	Given the lengths of three sides of a triangle,
	 * 	determine if the triangle is isosceles, equilateral, or scalene.
	 * 	Equilateral means all three sides are the same.
	 * 	Isosceles means two sides are the same.
	 * 	Scalene means none of the sides are the same.
	 *	Example: 8, 8, 8 is equilateral.
	 */
	public static String whatTriangle(int a, int b, int c) {
		if(a == b && b == c) {
			return "Equilateral";
		} else if(a == b || a == c || b == c) {
			return "Isosceles";
		} else {
			return "Scalene";
		}
	}
	
	/*
	 * 8. Capitalize every other letter in a string
	 * 	Given a string that is all lowercase letters,
	 * 	write a method that converts every other letter into,
	 * 	uppercase beginning with the first letter.
	 * 	Example: "hello" = "HeLlO"
	 */
	public static String capitalizeOther(String s) {
		String changedWord = "";
		s.toCharArray();
		for( int i = 0; i < s.length(); i++) {
			if(i == 0 || i%2 == 0) {
				changedWord = changedWord + Character.toUpperCase(s.charAt(i));
			} else {
				changedWord = changedWord + s.charAt(i);
			}
		}
		return changedWord;
	}
	
	/*
	 * 9. Capitalize every other letter even BETTER!
	 * 	Same method as before, but what if I want to make sure,
	 * 	The other letters will be lowercase if I get a string that,
	 * 	does include capital letters already?
	 * 	Example: "INCREDIBLE" = "InCrEdIbLe"
	 * 	Example: "INCREdible" = "InCrEdIbLe"
	 */
	public static String capitalizeOtherBetter(String s) {
		String changedWord = "";
		s.toCharArray();
		for( int i = 0; i < s.length(); i++) {
			if(i == 0 || i%2 == 0) {
				changedWord = changedWord + Character.toUpperCase(s.charAt(i));
			} else if(i%2 == 1) {
				changedWord = changedWord + Character.toLowerCase(s.charAt(i));
			}
		}
		return changedWord;
	}
	
	/*
	 * 10. Capitalize every other letter of a string
	 * 	that contains multiple words beginning with the
	 * 	first letter of each word and makes the other letters lowercase.
	 * 	Example: "trying NEW THIngs" = "TrYiNg NeW ThInGs"
	 */
	public static String capitalizeOtherWordsBetter(String s) {
		String changedStringWords = "";
		String[] words = s.split("\\s");
		for( String word : words) {
			String changedWord = "";
			word.toCharArray();
			for( int i = 0; i < word.length(); i++) {
				if(i == 0 || i%2 == 0) {
					changedWord = changedWord + Character.toUpperCase(word.charAt(i));
				} else if(i%2 == 1) {
					changedWord = changedWord + Character.toLowerCase(word.charAt(i));
				}
			}
			changedStringWords = changedStringWords + " " + changedWord;
		}
		return changedStringWords.trim();
	}
	
}