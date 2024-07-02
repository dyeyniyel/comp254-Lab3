package com.exercise3.janiel.javier;

import java.util.Scanner;

public class VowelConsonantChecker {

	//method for counting vowels
	public static int vowelCount(String s, int stringIndex) {
		if (stringIndex < 0) {  //base case: when index is less than 0, return 0 as no more characters will be checked
			return 0;
		} else {
			char lcc = Character.toLowerCase(s.charAt(stringIndex)); //to cover case sensitivity scenario. Get character at current index and make it lowercase

			//if character is a vowel, return 1
			int count;
			if ("aeiou".contains(String.valueOf(lcc))) { 
				count = 1;
			} else {
				count = 0;
			}
			//add count to the result then perform recursive call on the rest of the string
			return count + vowelCount(s, stringIndex - 1);
		}
	}


	//method for counting consonants
	public static int consonantCount(String s, int index) {
		if (index < 0) { //base case: when index is less than 0, return 0 as no more characters will be checked
			return 0;
		} else {
			char lcc2 = Character.toLowerCase(s.charAt(index)); //to cover case sensitivity scenario. Get character at current index and make it lowercase
			//if character is NOT a vowel, return 1
			int count;
			//also check if user input is a letter. If not, disregard to the count
			if (Character.isLetter(lcc2) && !"aeiou".contains(String.valueOf(lcc2))) {
				count = 1;
			} else {
				count = 0;
			}

			//add count to the result then perform recursive call on the rest of the string
			return count + consonantCount(s, index - 1);
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
			System.out.println("\nPlease enter a string (or type '1' to quit):");
			s = scanner.nextLine();
			if (!s.equals("1")) {
				
				//display vowel and consonant count
				int vowelCount = vowelCount(s, s.length() - 1);
				int consonantCount = consonantCount(s, s.length() - 1);
				System.out.println("Vowel count: " + vowelCount);
				System.out.println("Consonant count: " + consonantCount);
				
				
				//use cases for vowel and consonant checker
				if (vowelCount > consonantCount) {
					System.out.println("The string has more vowels than consonants.");
				} else if (vowelCount < consonantCount) {
					System.out.println("The string has more consonants than vowels.");
				} else {
					System.out.println("The string has an equal number of vowels and consonants.");
				}
			}
		} while (!s.equals("1"));
		System.out.println("Thank you for using this application. Goodbye!");
		scanner.close();
	}


}


