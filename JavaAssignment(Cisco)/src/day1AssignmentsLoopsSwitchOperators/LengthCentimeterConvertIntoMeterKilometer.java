package day1AssignmentsLoopsSwitchOperators;

import java.util.Scanner;

public class LengthCentimeterConvertIntoMeterKilometer {

	public static void main(String[] args) {
		// write  a java program to enter length in centimeter and convert it into meter kilometer.
		
Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the length in centimeter::\n");
		
		float c = in.nextInt();
		float m;
		float k;
		
		//c = centimeter
		// m = meter
		// k = kilometer
		
		m = (float)(c/100);
		k = (float)(c/100000);
		
		System.out.println("\n");
		System.out.println("Length in centimeter = "+m+"meter");
		System.out.println("Length in kilometer = "+k+"kilometer");

	}

}
