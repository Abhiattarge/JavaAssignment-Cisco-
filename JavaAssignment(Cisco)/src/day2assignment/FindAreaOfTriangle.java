package day2assignment;

import java.util.Scanner;

public class FindAreaOfTriangle {

	public static void main(String[] args) {
		// write a java program to enter base and height of a triangle and find its area.
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter the base & height of the teiangle::\n");
		
		float b =in.nextFloat();
		float h =in.nextFloat();
		float a;
		
		//b = base
		//h = height
		//a = area
		
		a = (float)((b * h) / 2);
		
		System.out.println("\nArea of Triangle = "+a+"sq. uniits\n");

	}

}
