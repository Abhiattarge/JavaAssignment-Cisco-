package day2assignment;

import java.util.Scanner;

public class CalculateTotalAvgPer {

	public static void main(String[] args) {
		// write a java program to center marks of five subjects and calculate total,average,percentage
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the marks of five subjects:\n");
		
		float sub_1=in.nextFloat();
		float sub_2=in.nextFloat();
		float sub_3=in.nextFloat();
		float sub_4=in.nextFloat();
		float sub_5=in.nextFloat();
		
		float total;
		float average;
		float percentage;
		
		total = sub_1+sub_2+sub_3+sub_4+sub_5;
		
		
		average = (float)(total/5.0);
		
		percentage = (float)((total/500.0)*100);
		
		

		System.out.println("\nThe Total Marks = "+total+"/500.0");
		System.out.println("The Average marks = "+average);
		System.out.println("The percentage ="+percentage+"%");
		
		

	}

}
