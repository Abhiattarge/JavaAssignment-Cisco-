package day2assignment;

import java.util.Scanner;

public class FindThirdAngle {

	public static void main(String[] args) {
		// write a java program to enter two angle of triangle and find the third angle.
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the angles of triangles::\n");
		
		int p = in.nextInt();
		int q = in.nextInt();
		int r;
		
		//p,q and r is all angle
		
		r = 180 - (p + q);
		//Compute third angle
		
		System.out.println("\nThird angle of triangle = "+r+"\n");

	}

}
