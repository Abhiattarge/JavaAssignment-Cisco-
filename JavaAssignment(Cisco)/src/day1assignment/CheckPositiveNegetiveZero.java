package day1assignment;

import java.util.Scanner;

public class CheckPositiveNegetiveZero {

	public static void main(String[] args) {
		// write a program to check number positive negetive zero
		
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
