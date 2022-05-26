package day4assignment;

import java.util.Scanner;

public class ScannerByteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter byte First number range in 127 : ");
		byte num1=sc.nextByte();
		
		System.out.println("Enter byte Second number range in -128 : ");
		byte num2=sc.nextByte();
		
		
		System.out.println("num1 : "+ num1);
		System.out.println("num2 : "+ num2);

	}

}
