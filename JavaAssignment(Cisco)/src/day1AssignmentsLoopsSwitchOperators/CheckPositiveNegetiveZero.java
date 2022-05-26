package day1AssignmentsLoopsSwitchOperators;

import java.util.Scanner;

public class CheckPositiveNegetiveZero {

	public static void main(String[] args) {
		// write a java program to check whether number is positive negative zero.
		
        int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		num=sc.nextInt();
		
		if(num>0)
		{
			System.out.println(num+"Number is positive");
		}
		else if(num<0)
		{
			System.out.println(num+"number is negetive");
		}
		else
		{
			System.out.println(num+"number is Zero");
		}


	}

}
