package day1assignment;

import java.util.Scanner;

public class LargestThreeNum {

	public static void main(String[] args) {
		
		//find the largest number between three number
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,num3;
		
		System.out.println("Enter num1");
		num1=sc.nextInt();
		System.out.println("Enter num2");
		num2=sc.nextInt();
		System.out.println("Enter num3");
		num3=sc.nextInt();
		
		if(num1>=num2 && num1>=num3)
		{
			System.out.println(num1 +" num1 is the large number");
		}
		else if(num2>=num1 && num2>=num3)
		{
			System.out.println(num2 +" num2 is the large number");
		}
		else
		{
			System.out.println(num3 +" num3 is the large number");
		}
		

	}

}
