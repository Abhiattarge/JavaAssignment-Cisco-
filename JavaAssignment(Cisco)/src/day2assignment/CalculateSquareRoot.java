package day2assignment;

import java.util.Scanner;

public class CalculateSquareRoot {

	public static void main(String[] args) {
		// write a java program to enter any number and calculate its square root.
		Scanner in=new Scanner(System.in);
		
		System.out.println("Ente the number to find the square root::\n");
		
		double n =in.nextDouble();
		double r;
		
		//n = number
		//r = root
		
		r=(double)Math.sqrt(n);
		
		System.out.println("\nSquare root of :: "+n+"="+r+"\n");

	}

}
