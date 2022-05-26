package day2assignment;

import java.util.Scanner;

public class CalculateAreaOfEquilateralTriangle {

	public static void main(String[] args) {
		// write a java program to calculate area of an equilateral triangle
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the side of an equilateral triangle::\n");
		
		float s = in.nextFloat();
		float a;
		
		//s = side
		// a = area
		
		a = (float)((Math.sqrt(3)/4)*(s*s));
		
		System.out.println("\nArea of the equilateral triangle = "+a+"\n");

	}

}
