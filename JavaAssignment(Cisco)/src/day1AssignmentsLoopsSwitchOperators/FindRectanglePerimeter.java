package day1AssignmentsLoopsSwitchOperators;

import java.util.Scanner;

public class FindRectanglePerimeter {

	public static void main(String[] args) {
		// write a java program to enter length and breadth of rectangle and find its perimeter.
		
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter Length of Rectangle : ");
				double length=sc.nextInt();
				
				System.out.println("Enter Breadth of Rectangle : ");
				double breadth=sc.nextInt();
			
				
				double peremeter=2*(length+breadth);
				
				System.out.println("Area of Peremeter = "+peremeter);
				
	}

}
