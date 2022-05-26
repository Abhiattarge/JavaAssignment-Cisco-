package day1AssignmentsLoopsSwitchOperators;

import java.util.Scanner;

public class CalculateSimpleIntrest {

	public static void main(String[] args) {
		// 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the principle: ");
		double p=input.nextDouble();
		
		System.out.println("Enter the Time: ");
		double t=input.nextDouble();
		
		System.out.println("Enter the rate: ");
		double r=input.nextDouble();
		
		double si = (p*t*r)/100;
		
		System.out.println("Principle: "+p);
		System.out.println("Time Duration : "+t);
		System.out.println("Intrest Rate: "+r);
		System.out.println("Simple Intrest :"+si);
	}

}
