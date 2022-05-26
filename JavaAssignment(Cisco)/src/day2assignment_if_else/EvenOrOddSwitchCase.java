package day2assignment_if_else;

import java.util.Scanner;

public class EvenOrOddSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number: ");
		int n=sc.nextInt();
		
		switch(n%2)
		{
		case 0:
			System.out.println("Even Number....");
			break;
		case 1:
			System.out.println("Odd Number....");
			break;
		default:
			System.out.println("Invalid Number....");
		}

	}

}
