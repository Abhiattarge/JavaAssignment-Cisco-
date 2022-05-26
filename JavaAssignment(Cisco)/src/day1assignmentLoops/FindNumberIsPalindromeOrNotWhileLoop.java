package day1assignmentLoops;

import java.util.Scanner;

public class FindNumberIsPalindromeOrNotWhileLoop {

	public static void main(String[] args) {
		// find out if given number is palindrome or not.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		
		int r,sum=0,temp;
		
		
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
