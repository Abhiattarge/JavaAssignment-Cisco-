package day4assignment;

import java.util.Scanner;

public class ScannerCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter Ch value char1 : ");
		char char1=sc.nextLine().charAt(0);
		
		System.out.println("Enter ch value char2 : ");
		char char2=sc.nextLine().charAt(0);
		
		System.out.println("this is chareter data types : "+ char1);
		System.out.println("this is charecter data types : "+ char2);

	}

}
