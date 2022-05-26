package day1assignmentExtra;

import java.util.Scanner;

public class AcceptPercentage {

	public static void main(String[] args) {
		// wap to calculate student result by accepting percentage from user.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Plaese Enter your Percentage : "+"%");
		float percentage=sc.nextFloat();
		
		if(percentage >= 70 )
		{
			System.out.println("Grade : First Class With Distingtion");
		}
		else if(percentage >= 55)
		{
			System.out.println("Grade : Second Class");
		}
		else if(percentage >= 50 && percentage <= 60)
		{
			System.out.println("Grade : Third Class");
		}
		else if(percentage >= 40 && percentage <=50)
		{
			System.out.println("Grade : Pass");
		}
		else
		{
			System.out.println("Grade : Fail");
		}
		


	}

}
