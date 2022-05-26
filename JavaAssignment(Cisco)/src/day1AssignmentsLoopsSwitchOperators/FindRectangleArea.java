package day1AssignmentsLoopsSwitchOperators;

import java.util.Scanner;

public class FindRectangleArea {

	public static void main(String[] args) {
		// write a java program to enter length and breadth of rectangle and find its area.
		
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter length of Rectangle : ");
				double length=sc.nextInt();
				
				System.out.println("Enter breadth of Rectangle : ");
				double breadth=sc.nextInt();
			
				double area=length*breadth;
				
				
				System.out.println("Area of Rectangle = "+area);
				
	}

}
