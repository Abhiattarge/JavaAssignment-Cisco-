package day1AssignmentsLoopsSwitchOperators;

import java.util.Scanner;

public class CheckAlphabetCharacterDigit {

	public static void main(String[] args) {
		// write a java program o input any characture and check whether it is alphabet,digit or special character.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Character : ");
		char ch = sc.next().charAt(0);
		
		if((ch >= 'a'&&  ch <='z')||(ch>='A' && ch<='Z'))
		{
			System.out.println(ch+" is A ALPHABET .");
		}
		else if(ch >= '0' && ch<= '9')
		{
			System.out.println(ch+" is A DIGIT .");
		}
		else
		{
			System.out.println(ch+" is A SPECIAL CHARACTURE .");
		}
	}

}
