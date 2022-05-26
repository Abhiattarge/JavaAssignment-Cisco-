package day3assignment;

import java.util.Scanner;

public class MaxThreeNumbers {

	public static void main(String[] args) {
		// write a java program to find maximum between three numbers.
		
		int a,b,c,largest;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		a=sc.nextInt();
		
		System.out.println("Enter Second Number : ");
		b=sc.nextInt();
		
		System.out.println("Enter Third Number : ");
		c=sc.nextInt();
		
		largest= c>(a>b ? a:b)? c:((a>b)?a:b);
		
		System.out.println("The largest number is: "+largest);

	}

}
