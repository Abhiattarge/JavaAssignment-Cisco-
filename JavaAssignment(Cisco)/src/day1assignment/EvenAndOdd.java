package day1assignment;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		// Even And Odd
		
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
