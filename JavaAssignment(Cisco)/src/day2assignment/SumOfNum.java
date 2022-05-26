
package day2assignment;

import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {
		// Write a java program to enter two numbers and their sum.
		
		int x,y,sum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		
		x= sc.nextInt();
		
		System.out.print("Enter the second number: ");
		
		y=sc.nextInt();
		
		sum=x+y;
		
		System.out.println("The sum of two number x and y is: "+sum);

	}

}
