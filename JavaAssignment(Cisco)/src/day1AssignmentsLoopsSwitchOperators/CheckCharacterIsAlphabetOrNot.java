package day1AssignmentsLoopsSwitchOperators;

import java.util.Scanner;

public class CheckCharacterIsAlphabetOrNot {

	public static void main(String[] args) {
		// write a java program to check whether character is alphabet or not. 
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Character : ");
		char c=sc.next().charAt(0);
		
		if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
		{
			System.out.println(c + " is a alphabet");
		}
		else
		{
			System.out.println(c + " is not alphabet");
		}

	}

}
