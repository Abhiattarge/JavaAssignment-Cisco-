package day3assignment;

import java.util.Scanner;

public class NegetivePositiveZero {

	public static void main(String[] args) {
		// write a java program to check whether a number is negative , positive or zero.
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any integer : ");
		num = sc.nextInt();
		
		if(num>0)
		{
			System.out.println(num + " is Positive number.");
		}
		else if(num<0)
		{
			System.out.println(num + " is Negative number ");
		}
		else
		{
			System.out.println(" It's Zero");
		}

	}

}
