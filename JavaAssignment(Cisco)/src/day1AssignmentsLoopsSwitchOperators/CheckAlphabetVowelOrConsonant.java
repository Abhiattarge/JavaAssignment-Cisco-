package day1AssignmentsLoopsSwitchOperators;

import java.util.Scanner;

public class CheckAlphabetVowelOrConsonant {

	public static void main(String[] args) {
		// write a java program to check alphabet vowel or consonant.
		
        Scanner sc = new Scanner(System.in);
		
		char ch;
		
		System.out.println("Enter any alphabet :");
		
		ch =sc.next().charAt(0);
		
		
		
		if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
		{
			System.out.println(ch + " is vowel");
		}
		else
			System.out.println(ch + " is consonant");


	}

}
