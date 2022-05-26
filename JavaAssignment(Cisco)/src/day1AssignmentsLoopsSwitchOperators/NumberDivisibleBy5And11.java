package day1AssignmentsLoopsSwitchOperators;

import java.util.Scanner;

public class NumberDivisibleBy5And11 {

	public static void main(String[] args) {
		//write a java program to check whether a number is divisible by 5 and 11 or not.
		
        int number;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		number = sc.nextInt();
		
		if((number % 5 == 0) && (number % 11 == 0))
		{
			System.out.println("Number "+ number + " Is Divisible by 5 and 11");
		}
		else
		{
			System.out.println("Number "+ number + " Is Not Divisible by 5 and 11");
		}


	}

}
