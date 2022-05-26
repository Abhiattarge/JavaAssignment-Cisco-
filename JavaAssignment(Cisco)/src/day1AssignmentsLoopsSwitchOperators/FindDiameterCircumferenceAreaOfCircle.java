package day1AssignmentsLoopsSwitchOperators;

import java.util.Scanner;

public class FindDiameterCircumferenceAreaOfCircle {

	public static void main(String[] args) {
		// write a java program to enter radius of a circle and find its diameter,circumference and area.
		
        Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the radius of circle::\n");
		
		float r=in.nextInt();
		float d;
		float c;
		float a;
		
		//r = radius
		// d = diameter
		// c = circumference
		// a = area
		
		d = 2 * r;
		c = 2 * (float)3.14 * r;
		a = (float)3.14 * (r *r);
		
		System.out.println("\n");
		System.out.println("Diameter = "+d+"units");
		System.out.println("Circumference = "+c+"units");
		System.out.println("Area = "+a+"sq.units");

	}

}

