package day4assignment;

import java.util.Scanner;

public class ScannerBooleanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1 : ");
		 int num1=sc.nextInt();
		System.out.println("Enter num2 : ");
		int num2=sc.nextInt();
		
		boolean b1=true;
		boolean b2=false;
		
		if(num1<num2)
		{
			System.out.println("Boolean true is : "+b1);
		}
		else
		{
			System.out.println("Boolean false is :  "+b2);
		}

	}

}
