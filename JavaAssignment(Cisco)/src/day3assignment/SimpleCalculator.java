package day3assignment;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// write a java program to create simple calculator.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		double firstnumber = sc.nextDouble();
		
		System.out.println("Enter the second number : ");
		double secondnumber = sc.nextDouble();
		
		System.out.println("Enter Operator");
		System.out.println("Addition + ");
		System.out.println("Subtraction - ");
		System.out.println("Multiplication * ");
		System.out.println("division / : ");
		
		char op = sc.next().charAt(0);
		
		if(op == '+')
		{
			System.out.println("The Addition of "+ firstnumber +" and "+ secondnumber +"="+(firstnumber + secondnumber));
		}
		else if(op == '-')
		{
			System.out.println("The Subtraction of "+ firstnumber +" and "+ secondnumber +"="+(firstnumber - secondnumber));
		}
		else if(op == '*')
		{
			System.out.println("The Multiplication of "+ firstnumber +" and "+ secondnumber +"="+(firstnumber * secondnumber));
		}
		else if(op == '/')
		{
			System.out.println("The Division of "+ firstnumber +" and "+ secondnumber +"="+(firstnumber / secondnumber));
		}
		else
		{
			System.out.println("Invalid Input");
		}
		

	}

}
