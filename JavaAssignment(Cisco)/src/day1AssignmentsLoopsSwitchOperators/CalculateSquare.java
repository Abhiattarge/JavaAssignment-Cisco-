package day1AssignmentsLoopsSwitchOperators;

import java.util.Scanner;

public class CalculateSquare {

	public static void main(String[] args) {
		// write a java program to enter any number and calculate its square.
		
        Scanner in=new Scanner(System.in);
		
		System.out.println("Ente the number to find the square :\n");
		
		int n =in.nextInt();
		int square;
		
		//n = number
		// square = square
		
		
		square=n*n;
		
		System.out.println("\nSquare  of : "+n+"="+square+"\n");


	}

}
