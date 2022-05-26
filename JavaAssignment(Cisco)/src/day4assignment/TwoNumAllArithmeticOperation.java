package day4assignment;

import java.util.Scanner;

public class TwoNumAllArithmeticOperation {

	public static void main(String[] args) {
		// write a java program to enter two numbers and perform all arithmetic operations using different methods for different operations.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any positive integer number : ");
		
		int p =sc.nextInt();
		int q = sc.nextInt();
		int Sum,Sub,Mul,Mod;
		float Div;
		
		Sum = p + q;
		Sub = p - q;
		Mul = p * q;
		Div = p / q;
		Mod = p % q;
		
		System.out.println("\n Sum "+p+"+"+q+"="+ Sum);
		System.out.println("\n Sub "+p+"-"+q+"="+ Sub);
		System.out.println("\n Mul "+p+"*"+q+"="+ Mul);
		System.out.println("\n Div "+p+"/"+q+"="+ Div);
		System.out.println("\n Mod "+p+"%"+q+"="+ Mod);
		
	}
	public static int Sum(int x, int y) {
		return x + y;
	}
	public static int Sub(int x, int y) {
		return x - y;
	}
	public static int Mul(int x, int y) {
		return x * y;
	}
	public static int Div(int x, int y) {
		return x / y;
	}
	public static int Mod(int x, int y) {
		return x % y;
	}

}
