package day4assignment;

import java.util.Scanner;

public class ScannerShortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value in range -32768 a : ");
		short a=sc.nextShort();
		
		System.out.println("Enter value in range 32767 b : ");
		short b=sc.nextShort();
		
		System.out.println("Short value is : "+ a);
		System.out.println("Short value is : "+ b);

	}

}
