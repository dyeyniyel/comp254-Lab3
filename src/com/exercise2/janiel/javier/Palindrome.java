package com.exercise2.janiel.javier;

import java.util.Scanner;

public class Palindrome {

	//recursive function for checking if a string is palindrome
	public static boolean isStringPalindrome(String pal) {
		if (pal.length() <= 1)  //base case for usecases where input string is empty or only one character which is still considered a palindrome
		{
			return true;
		} 
		else
		{
			return pal.charAt(0) == pal.charAt(pal.length() - 1) //check first and last characters of the string, and return true if both are equal
					&& isStringPalindrome(pal.substring(1,pal.length() -1)); //check if the substring created without the first and last character is a palindrome. if yes, also return true
		}
	}

	//main method
	//Student Number: 301379377
	//Student Name: Janiel Mark Javier
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s;
		//loop to continuously ask user for string input 
		do {
			System.out.println("Please enter a string for palindrome checking (or type 'exit' to quit this application):");
			s = scanner.nextLine();
			if (!s.equalsIgnoreCase("exit")) {
				System.out.println("Input: " + s);

				s = s.toLowerCase(); //this scenario is to cover case sensitivity for palindrome checking
				s = s.replaceAll("[^a-z]", ""); //this scenario is to handle whitespaces for palindrome checking. This is for removing all non-alphanumeric characters

				if (isStringPalindrome(s)) {
					System.out.println("\nTRUE: The string is a palindrome."); //display TRUE if string is a palindrome
				} else {
					System.out.println("\nFALSE: The string is not a palindrome."); //otherwise, false
				}
			}
		} while (!s.equalsIgnoreCase("exit"));  //quit the app if the user types "exit"
		System.out.println("Thank you for using this application. Goodbye!");
		scanner.close();
	}
}
