package day1AssignmentsLoopsSwitchOperators;

import java.util.Scanner;

public class AreaOfTriangleBaseHeight {

	public static void main(String[] args) {
		// write a java program to enter base and height of a triangle and find its area.
		
        float base,height,area;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter base of tringle : ");
        base=sc.nextFloat();
        
        System.out.println("Enter heigth of triangle : ");
        height=sc.nextFloat();
		
		area=(base*height)/2;
		
		System.out.println("Area of Triangle = "+area);


	}

}
