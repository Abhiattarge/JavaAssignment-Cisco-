package day2assignment;

import java.util.Scanner;

public class NumOfArithOperation {

	public static void main(String[] args) {
		//write a java program to enter two number and perform all arithmetic operations.
		
		int num1,num2;
		int sum,sub,mult,mod;
		float div;
		Scanner op=new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		num1=op.nextInt();
		System.out.print("Enter second number: ");
		num2=op.nextInt();
		
		
		sum=num1 + num2;
		sub=num1 - num2;
		mult=num1 * num2;
		div=(float)num1 / num2;
		mod=num1 % num2;
		
		System.out.println("sum = "+sum);
		System.out.println("sub = "+sub);
		System.out.println("mult = "+mult);
		System.out.println("div = "+div);
		System.out.println("mod = "+mod);
		
		
		}

}
