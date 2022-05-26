package day1AssignmentsLoopsSwitchOperators;

import java.util.Scanner;

public class CalculateCompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the principle: ");
		double p=input.nextDouble();
		
		System.out.println("Enter the Time: ");
		double t=input.nextDouble();
		
		System.out.println("Enter the rate: ");
		double r=input.nextDouble();
		
		System.out.println("Enter number of times intrests is compounded: ");
		int number=input.nextInt();
		
		double ci = p * (Math.pow((1 + r/100), (t * number))) - p;
		
		System.out.println("Principle: "+p);
		System.out.println("Time Duration : "+t);
		System.out.println("Intrest Rate: "+r);
		System.out.println("Number of time interest compounded: "+number);
		System.out.println("Compound Intrest :"+ci);

	}

}
