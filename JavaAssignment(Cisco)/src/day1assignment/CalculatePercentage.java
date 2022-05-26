package day1assignment;

import java.util.Scanner;

public class CalculatePercentage {

	public static void main(String[] args) {
		// Calculate percentage of five subject marks.
		 Scanner in = new Scanner(System.in);
			
			System.out.println("Enter the marks of five subjects:\n");
			
			float sub_1=in.nextFloat();
			float sub_2=in.nextFloat();
			float sub_3=in.nextFloat();
			float sub_4=in.nextFloat();
			float sub_5=in.nextFloat();
			
			
			
			float percentage;
			float total;
			
			
			total=sub_1+sub_2+sub_3+sub_4+sub_5;
			
			percentage = (float)((total/500.0)*100);
			
			if(percentage >= 90 && percentage <= 100 )
			{
				System.out.println("Grade : Distingtion");
			}
			else if(percentage >= 60 && percentage <= 80)
			{
				System.out.println("Grade : First Class");
			}
			else if(percentage >= 50 && percentage <= 60)
			{
				System.out.println("Grade : Second Class");
			}
			else if(percentage >= 40 && percentage <=50)
			{
				System.out.println("Grade : Third Class");
			}
			else
			{
				System.out.println("Grade : Fail");
			}
			

			System.out.println("\nThe Total Marks = "+total+"/500.0");
			System.out.println("The percentage ="+percentage+"%");
			
	}

}
