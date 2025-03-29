package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//2inputs
		String text1 = "stops";
		String text2 = "potss";
		//check 2 input lengths are equal
		if (text1.length() != text2.length()) {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
        //Convert both the strings to character arrays
		char[] charArray1= text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		//Sort both the character arrays
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		//Check if the sorted arrays are equal
        if (Arrays.equals(charArray1, charArray2)) {
			System.out.println("The given strings are Anagram.");
		} else {
            System.out.println("The given strings are not an Anagram.");
		}
	}

}
