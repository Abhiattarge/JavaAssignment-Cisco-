package day1AssignmentsLoopsSwitchOperators;

import java.util.Scanner;

public class ChechAlphabetVowelOrConsonantUsinSwitchCase {

	public static void main(String[] args) {
		// write a java program to check whether an alphabet is vowel or consonant using switch case.
		
		boolean isVowel=false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch=sc.next().charAt(0);
		sc.close();
		
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': isVowel = true;
			
		}
		if(isVowel == true)
		{
			System.out.println(ch+" is a vowel.");
		}
		else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			System.out.println(ch+" is a Conconant.");
		}
		else
		{
			System.out.println("Input is not alphabet.");
		}
		
	

	}

}
