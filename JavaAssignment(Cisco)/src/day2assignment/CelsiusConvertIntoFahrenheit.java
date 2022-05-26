package day2assignment;

import java.util.Scanner;

public class CelsiusConvertIntoFahrenheit {

	public static void main(String[] args) {
		// write a java program to enter temperature in celsius and convert it into Fahrenheit.
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter athe temperature in celsius::\n");
		
		float c = in.nextFloat();
		float f;
		
		//c = celsius
		//f = fahreheit
		
		f = (float)((c * 9/5)+32);
		
		System.out.println("\n");
		System.out.println(c +"celsius = "+f+"Fahrenheit");

	}

}
