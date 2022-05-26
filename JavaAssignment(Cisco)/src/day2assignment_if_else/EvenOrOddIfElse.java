package day2assignment_if_else;

import java.util.Scanner;

public class EvenOrOddIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Enter an integer number to check:\n");
		
		x = sc.nextInt();
		
		if(x%2==0)
		{
			System.out.println("The input number is Even.\n");
		}
		else
		{
			System.out.println("The input number is Odd.\n");
		}

	}

}
