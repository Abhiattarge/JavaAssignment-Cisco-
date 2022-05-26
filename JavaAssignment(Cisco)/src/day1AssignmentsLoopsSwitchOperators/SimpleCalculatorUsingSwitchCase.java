package day1AssignmentsLoopsSwitchOperators;

import java.util.Scanner;

public class SimpleCalculatorUsingSwitchCase {

	public static void main(String[] args) {
		// write a java program simple calculator using switch case.
		
		double num1,num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		num1=sc.nextDouble();
		
		System.out.println("Enter Second Number : ");
		num2=sc.nextDouble();
		
		System.out.println("Enter an Operator (+, -, *, /): ");
		char operator = sc.next().charAt(0);
		
		sc.close();
		double output;
		
		switch(operator)
		{
		case '+':
			output = num1 + num2;
			break;
			
		case '-':
			output = num1 - num2;
			break;
		
		case '*':
			output = num1 * num2;
			break;
			
		case '/':
			output = num1 / num2;
			break;
		
		default:
			System.out.println("You have entered wrong Operator.");
			return;
		}
		System.out.println(num1+" "+operator+" "+num2+": "+output);
	}

}
