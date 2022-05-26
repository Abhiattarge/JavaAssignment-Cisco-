package day3assignment;

import java.util.Scanner;

public class NumberEvenOdd {

	public static void main(String[] args) {
		// write a java program to check whether a number is even or odd.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Number is even = "+num);
		}
		else
		{
			System.out.println("Number is Odd"+num);
		}

	}

}
